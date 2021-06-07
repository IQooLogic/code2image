package rs.devlabs.code2img.utils;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Optional;
import rs.devlabs.code2img.Code2ImageSettingsBuilder.Code2ImageSettings;
import rs.devlabs.code2img.Token;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public final class GraphicsHelper {

    private static final String CREATED_BY_TEXT = "// created by code2image™";// watermark text or can be image
    private final Code2ImageSettings settings;

    private int lineHeight = -1;
    private int lineNumberFigures = -1;

    public GraphicsHelper(Code2ImageSettings settings) {
        this.settings = settings;
    }

    public void drawWindow(Graphics2D g, Dimension imageDimensions) {
        g.setPaint(settings.getTheme().background());
        g.fillRoundRect(0, 0, imageDimensions.width, imageDimensions.height, settings.getRectangleArc(), settings.getRectangleArc());
    }

    public void drawLines(Graphics2D g, FontMetrics metrics, List<String> lines) {
        int x = settings.getMargin();
        int y = metrics.getAscent() + settings.getButtonsHeight() + settings.getMargin();
        if (settings.isDrawLineNumbers()) {
            int spaceForLineNumbers = 2 * settings.getButtonSpace() + lineNumberFigures * metrics.charWidth(' ');
            x = spaceForLineNumbers;
            int lineNumber = 1;
            for (String line : lines) {
                drawLineNumber(g, lineNumber++, settings.getMargin(), y);
                drawLine(line, g, x, y, metrics);

                x = spaceForLineNumbers;// resets x for next line
                y += lineHeight;// move y down by one line height
            }
        } else {
            for (String line : lines) {
                drawLine(line, g, x, y, metrics);
                x = settings.getMargin();// resets x for next line
                y += lineHeight;// move y down by one line height
            }
        }

        if (settings.isDrawCreatedByText()) {
            drawCreatedByText(g, x, y, lineHeight);
        }
    }

    private void drawLine(String line, Graphics2D g, int x, int y, FontMetrics metrics) {
        List<Token> tokens = LexerUtils.parse(line, 0);

        for (int i = 0; i < line.length(); i++) {// basicaly jumping from token to token
            Optional<Token> optToken = findTokenByStart(i, tokens);
            if (optToken.isPresent()) {
                Token token = optToken.get();
                Color color = settings.getTheme().getColorForTokenType(token.type);
                for (int j = 0; j < token.length; j++) {// draw all character for that token
                    String s = String.valueOf(line.charAt(i++));// get next char
                    drawCode(g, s, x, y, color);
                    x += metrics.charWidth(' ');// move x right by one char width
                }// mora da vracam 'i' i 'x'
                --i;// get one char back because we moved ahead by one char in j for loop
            } else {// this is probably space only
                drawCode(g, String.valueOf(line.charAt(i)), x, y, settings.getTheme().foreground());
                x += metrics.charWidth(' ');// move x right by one char width
            }
        }
    }

    private void drawLineNumber(Graphics2D g, int lineNumber, int x, int y) {
        g.setColor(settings.getTheme().lineNumbersColor());
        g.drawString(Integer.toString(lineNumber), x, y);
    }

    private void drawCode(Graphics2D g, String line, int x, int y, Color color) {
        g.setColor(color);
        g.drawString(line, x, y);
    }

    private void drawCreatedByText(Graphics2D g, int x, int y, int lineHeight) {
        g.setColor(settings.getTheme().createdByTextColor());
        g.drawString("", x, y);
        y += lineHeight;
        g.drawString(CREATED_BY_TEXT, x, y);
    }

    public Graphics2D createGraphics(BufferedImage image) {
        Graphics2D g = image.createGraphics();
        g.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VRGB);
        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
//        g.setRenderingHint(
//                RenderingHints.KEY_ALPHA_INTERPOLATION,
//                RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
//        g.setRenderingHint(
//                RenderingHints.KEY_FRACTIONALMETRICS,
//                RenderingHints.VALUE_FRACTIONALMETRICS_ON);

        g.setFont(settings.getFont());
        return g;
    }

    public Dimension calculateImageDimensions(List<String> lines) throws IllegalArgumentException {
        Canvas canvas = new Canvas();
        FontMetrics metrics = canvas.getFontMetrics(settings.getFont());

        Optional<String> optLongestLine = getLongestLine(lines);
        if (optLongestLine.isPresent()) {
            lineHeight = metrics.getAscent() + 5;
            lineNumberFigures = howManyFigures(lines.size());
            int width = metrics.stringWidth(optLongestLine.get()) + 4 * settings.getMargin();
            int height = lineHeight * lines.size() + settings.getButtonsHeight() + 2 * settings.getMargin();
            if (settings.isDrawLineNumbers()) {
                width += calculateLineNumbersSpace(metrics);
            }
            if (settings.isDrawCreatedByText()) {
                height += 2 * lineHeight;
            }
            return new Dimension(width, height);
        }
        throw new IllegalArgumentException();
    }

    private int calculateLineNumbersSpace(FontMetrics metrics) {
        return 2 * settings.getButtonSpace() + lineNumberFigures * metrics.charWidth('a');
    }

    public void drawWindowButtons(Graphics2D g) {
        g.setColor(settings.getTheme().exitButtonColor());
        int x = settings.getMargin();
        g.fillOval(x, settings.getMargin(), settings.getButtonRadius(), settings.getButtonRadius());
        g.setColor(settings.getTheme().maximizeButtonColor());
        x += settings.getButtonRadius() + settings.getButtonSpace();
        g.fillOval(x, settings.getMargin(), settings.getButtonRadius(), settings.getButtonRadius());
        g.setColor(settings.getTheme().minimizeButtonColor());
        x += settings.getButtonRadius() + settings.getButtonSpace();
        g.fillOval(x, settings.getMargin(), settings.getButtonRadius(), settings.getButtonRadius());
    }

    private Optional<String> getLongestLine(List<String> lines) {
        return lines.stream()
                .sorted((e1, e2) -> e1.length() > e2.length() ? -1 : 1)
                .findFirst();
    }

    private int howManyFigures(int number) {
        int figures = 0;
        while (number != 0) {
            number /= 10;
            figures++;
        }
        return figures;
    }

    private Optional<Token> findTokenByStart(long start, List<Token> tokens) {
        Optional<Token> optToken = tokens.stream().filter((token) -> token.start == start).findFirst();
        return optToken;
    }
}
