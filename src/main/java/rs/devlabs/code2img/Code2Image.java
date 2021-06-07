package rs.devlabs.code2img;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import rs.devlabs.code2img.Code2ImageSettingsBuilder.Code2ImageSettings;
import rs.devlabs.code2img.utils.FileUtils;
import rs.devlabs.code2img.utils.GraphicsHelper;
import rs.devlabs.code2img.utils.ImageUtils;
import rs.devlabs.code2img.utils.LexerUtils;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public final class Code2Image {

    // TODO : add more languages
    // TODO : add method font to theme interface
    // TODO : ability to change font style (italic, bold, plain) based on token type (for comment to be italic)
    // TODO : option to draw window buttons on the right
    // TODO : implement window border and drop shadow
    // TODO : implement image watermark
    // TODO : implement image backgrounds
    // TODO : create rest api endpoint for this (send settings and api returns image)
    private final Code2ImageSettings settings;
    private final GraphicsHelper graphicsHelper;

    public Code2Image(Code2ImageSettings settings) {
        this.settings = settings;
        this.graphicsHelper = new GraphicsHelper(settings);
    }

    public BufferedImage convert(File fileToConvert) throws IOException, NoSuchFileException {
        List<String> lines = FileUtils.read(fileToConvert);
        if (lines.isEmpty()) {
            throw new IllegalArgumentException("File is empty!");
        }

        LexerUtils.chooseLexerForFile(fileToConvert);

        return graphicsHelper.draw(lines);
    }

    public void convertAndSave(File fileToConvert, File outputFile) throws IOException, IllegalArgumentException, RuntimeException {
        BufferedImage image = convert(fileToConvert);
        if (!ImageUtils.save(image, settings.getFormat(), outputFile)) {
            throw new RuntimeException("Unexpected error writing image");
        }
    }

    public void convertAndSave(String fileToConvert, String fileOutput) throws IOException, IllegalArgumentException {
        convertAndSave(new File(fileToConvert), new File(fileOutput));
    }
}
