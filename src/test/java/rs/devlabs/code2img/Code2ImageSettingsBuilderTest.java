package rs.devlabs.code2img;

import java.awt.Font;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import rs.devlabs.code2img.Code2ImageSettingsBuilder.Code2ImageSettings;
import rs.devlabs.code2img.utils.ImageUtils.ImageFormat;
import rs.devlabs.code2img.themes.Theme;
import rs.devlabs.code2img.themes.Themes;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class Code2ImageSettingsBuilderTest {

    @Test
    public void testSetFont() {
        System.out.println("setFont");
        Font font = new Font("JetBrains Mono NL", Font.TRUETYPE_FONT, 16);
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        Font expResult = new Font("JetBrains Mono NL", Font.TRUETYPE_FONT, 16);
        Code2ImageSettings result = instance.setFont(font).build();
        assertEquals(expResult, result.getFont());
    }

    @Test
    public void testSetMargin() {
        System.out.println("setMargin");
        int margin = 20;
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        int expResult = 20;
        Code2ImageSettings result = instance.setMargin(margin).build();
        assertEquals(expResult, result.getMargin());
    }

    @Test
    public void testSetRectangleArc() {
        System.out.println("setRectangleArc");
        int rectangleArc = 20;
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        int expResult = 20;
        Code2ImageSettings result = instance.setRectangleArc(rectangleArc).build();
        assertEquals(expResult, result.getRectangleArc());
    }

    @Test
    public void testSetButtonRadius() {
        System.out.println("setButtonRadius");
        int buttonRadius = 12;
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        int expResult = 12;
        Code2ImageSettings result = instance.setButtonRadius(buttonRadius).build();
        assertEquals(expResult, result.getButtonRadius());
    }

    @Test
    public void testSetDrawLineNumbers() {
        System.out.println("setDrawLineNumbers");
        boolean drawLineNumbers = true;
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        boolean expResult = true;
        Code2ImageSettings result = instance.setDrawLineNumbers(drawLineNumbers).build();
        assertEquals(expResult, result.isDrawLineNumbers());
    }

    @Test
    public void testSetDrawCreatedByText() {
        System.out.println("setDrawCreatedByText");
        boolean drawCreatedByText = false;
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        boolean expResult = false;
        Code2ImageSettings result = instance.setDrawCreatedByText(drawCreatedByText).build();
        assertEquals(expResult, result.isDrawCreatedByText());
    }

    @Test
    public void testSetTheme() {
        System.out.println("setTheme");
        Theme theme = Themes.MATERIAL;
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        Theme expResult = Themes.MATERIAL;
        Code2ImageSettings result = instance.setTheme(theme).build();
        assertEquals(expResult, result.getTheme());
    }

    @Test
    public void testSetFormat() {
        System.out.println("setFormat");
        ImageFormat format = ImageFormat.GIF;
        Code2ImageSettingsBuilder instance = new Code2ImageSettingsBuilder();
        ImageFormat expResult = ImageFormat.GIF;
        Code2ImageSettings result = instance.setFormat(format).build();
        assertEquals(expResult, result.getFormat());
    }
}
