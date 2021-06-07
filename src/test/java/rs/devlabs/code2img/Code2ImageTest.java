package rs.devlabs.code2img;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rs.devlabs.code2img.Code2ImageSettingsBuilder.Code2ImageSettings;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class Code2ImageTest {

    public Code2ImageTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of("src/test/resources/code.png"));
    }

    @Test
    public void testConvert() throws FileNotFoundException, IOException {
        System.out.println("convert");
        File fileToConvert = new File("src/test/resources/code.txt");
        Code2ImageSettings settings = new Code2ImageSettingsBuilder().build();
        Code2Image instance = new Code2Image(settings);
        BufferedImage result = instance.convert(fileToConvert);
        assertNotEquals(null, result, "Image must not be null");
        Assertions.assertDoesNotThrow(() -> instance.convert(fileToConvert));
    }

    @Test
    public void testConvertNonexistantFile() {
        System.out.println("convert nonexistant file");
        Exception exception = assertThrows(NoSuchFileException.class, () -> {
            File fileToConvert = new File("nonexistant.txt");
            Code2ImageSettings settings = new Code2ImageSettingsBuilder().build();
            Code2Image instance = new Code2Image(settings);
            instance.convert(fileToConvert);
        });

        String expectedMessage = "nonexistant.txt";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testConvertEmptyFile() {
        System.out.println("convert empty file");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            File fileToConvert = new File("src/test/resources/empty.txt");
            Code2ImageSettings settings = new Code2ImageSettingsBuilder().build();
            Code2Image instance = new Code2Image(settings);
            instance.convert(fileToConvert);
        });

        String expectedMessage = "File is empty!";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testConvertAndSaveAs_3args_1() throws Exception {
        System.out.println("convertAndSave with file");
        File fileToConvert = new File("src/test/resources/code.txt");
        File fileOutput = new File("src/test/resources/code.png");
        Code2ImageSettings settings = new Code2ImageSettingsBuilder().build();
        Code2Image instance = new Code2Image(settings);
        instance.convertAndSave(fileToConvert, fileOutput);
        assertTrue(fileOutput.exists(), "code.png must exist!");
    }

    @Test
    public void testConvertAndSaveAs_3args_2() throws Exception {
        System.out.println("convertAndSave with string");
        Code2ImageSettings settings = new Code2ImageSettingsBuilder().build();
        Code2Image instance = new Code2Image(settings);
        instance.convertAndSave("src/test/resources/code.txt", "src/test/resources/code.png");
        assertTrue(Files.exists(Path.of("src/test/resources/code.png")), "code.png must exist!");
    }
}
