package rs.devlabs.code2img.utils;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class ImageUtils {

    private ImageUtils() {
    }

    public static BufferedImage create(int width, int height) {
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

    public static BufferedImage create(Dimension dimension) {
        return create(dimension.width, dimension.height);
    }

    public static boolean save(BufferedImage image, ImageFormat format, File outputFile) throws IOException {
        return ImageIO.write(image, format.getName(), outputFile);
    }

    public static String generateImageName(String prefixName, String theme, String extension) {
        return String.format("%s_%s.%s", prefixName, theme, extension);
    }

    public enum ImageFormat {
        PNG("PNG"), GIF("GIF"), TIFF("TIFF"), TIF("TIF");

        private final String name;

        private ImageFormat(String format) {
            this.name = format;
        }

        public String getName() {
            return name;
        }
    }
}
