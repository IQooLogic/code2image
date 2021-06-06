package rs.devlabs.code2img;

import java.awt.Font;
import rs.devlabs.code2img.themes.Theme;
import rs.devlabs.code2img.themes.Themes;
import rs.devlabs.code2img.utils.ImageUtils.ImageFormat;

public class Code2ImageSettingsBuilder {

    private Font font = new Font("JetBrains Mono NL", Font.PLAIN, 14);
    private int margin = 10;
    private int rectangleArc = 15;
    private int buttonRadius = 12;
    private boolean drawLineNumbers = false;
    private boolean drawCreatedByText = true;
    private Theme theme = Themes.ONEDARK;
    private ImageFormat format = ImageFormat.PNG;

    public Code2ImageSettingsBuilder() {
    }

    public Code2ImageSettingsBuilder setFont(Font font) {
        this.font = font;
        return this;
    }

    public Code2ImageSettingsBuilder setMargin(int margin) {
        this.margin = margin;
        return this;
    }

    public Code2ImageSettingsBuilder setRectangleArc(int rectangleArc) {
        this.rectangleArc = rectangleArc;
        return this;
    }

    public Code2ImageSettingsBuilder setButtonRadius(int buttonRadius) {
        this.buttonRadius = buttonRadius;
        return this;
    }

    public Code2ImageSettingsBuilder setDrawLineNumbers(boolean drawLineNumbers) {
        this.drawLineNumbers = drawLineNumbers;
        return this;
    }

    public Code2ImageSettingsBuilder setDrawCreatedByText(boolean drawCreatedByText) {
        this.drawCreatedByText = drawCreatedByText;
        return this;
    }

    public Code2ImageSettingsBuilder setTheme(Theme theme) {
        this.theme = theme;
        return this;
    }

    public Code2ImageSettingsBuilder setFormat(ImageFormat format) {
        this.format = format;
        return this;
    }

    public Code2ImageSettings build() {
        return new Code2ImageSettings(font, margin, rectangleArc, buttonRadius,
                3 * buttonRadius, buttonRadius, drawLineNumbers, drawCreatedByText, theme, format);
    }

    public class Code2ImageSettings {

        private Font font;
        private int margin;
        private int rectangleArc;
        private int buttonRadius;
        private int buttonsHeight;
        private int buttonSpace;
        private boolean drawLineNumbers;
        private boolean drawCreatedByText;
        private Theme theme;
        private ImageFormat format;

        private Code2ImageSettings(Font font, int margin, int rectangleArc,
                int buttonRadius, int buttonsHeight, int buttonSpace,
                boolean drawLineNumbers, boolean drawCreatedByText, Theme theme, ImageFormat format) {
            this.font = font;
            this.margin = margin;
            this.rectangleArc = rectangleArc;
            this.buttonRadius = buttonRadius;
            this.buttonsHeight = buttonsHeight;
            this.buttonSpace = buttonSpace;
            this.drawLineNumbers = drawLineNumbers;
            this.drawCreatedByText = drawCreatedByText;
            this.theme = theme;
            this.format = format;
        }

        public Font getFont() {
            return font;
        }

        public void setFont(Font font) {
            this.font = font;
        }

        public int getMargin() {
            return margin;
        }

        public void setMargin(int margin) {
            this.margin = margin;
        }

        public int getRectangleArc() {
            return rectangleArc;
        }

        public void setRectangleArc(int rectangleArc) {
            this.rectangleArc = rectangleArc;
        }

        public int getButtonRadius() {
            return buttonRadius;
        }

        public void setButtonRadius(int buttonRadius) {
            this.buttonRadius = buttonRadius;
        }

        public int getButtonsHeight() {
            return buttonsHeight;
        }

        public void setButtonsHeight(int buttonsHeight) {
            this.buttonsHeight = buttonsHeight;
        }

        public int getButtonSpace() {
            return buttonSpace;
        }

        public void setButtonSpace(int buttonSpace) {
            this.buttonSpace = buttonSpace;
        }

        public boolean isDrawLineNumbers() {
            return drawLineNumbers;
        }

        public void setDrawLineNumbers(boolean drawLineNumbers) {
            this.drawLineNumbers = drawLineNumbers;
        }

        public boolean isDrawCreatedByText() {
            return drawCreatedByText;
        }

        public void setDrawCreatedByText(boolean drawCreatedByText) {
            this.drawCreatedByText = drawCreatedByText;
        }

        public Theme getTheme() {
            return theme;
        }

        public void setTheme(Theme theme) {
            this.theme = theme;
        }

        public ImageFormat getFormat() {
            return format;
        }

        public void setFormat(ImageFormat format) {
            this.format = format;
        }
    }
}
