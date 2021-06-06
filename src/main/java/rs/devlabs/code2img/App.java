package rs.devlabs.code2img;

import java.awt.Font;
import java.io.IOException;
import rs.devlabs.code2img.Code2ImageSettingsBuilder.Code2ImageSettings;
import rs.devlabs.code2img.themes.Themes;
import rs.devlabs.code2img.utils.ImageUtils.ImageFormat;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class App {

    public static void main(String[] args) throws IOException {
        Code2ImageSettingsBuilder settingsBuilder = new Code2ImageSettingsBuilder();
        Code2ImageSettings settings = settingsBuilder
                .setFont(new Font("JetBrains Mono NL", Font.PLAIN, 14))
                .setMargin(10)
                .setRectangleArc(15)
                .setButtonRadius(12)
                .setDrawLineNumbers(true)
                .setDrawCreatedByText(true)
                .setTheme(Themes.A11YDARK)
                .setFormat(ImageFormat.PNG)
                .build();
        Code2ImageConverter converter = new Code2ImageConverter(settings);
        converter.convertAndSave("./src/test/resources/code.txt", "code.png");
    }

}
