package rs.devlabs.code2img.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class FileUtilsTest {

    @Test
    public void testReadBigFile() throws Exception {
        System.out.println("readBigFile");
        File file = new File("src/test/resources/code.txt");
        List<String> result = FileUtils.readBigFile(file);
        assertEquals(6, result.size());
    }

    @Test
    public void testReadBigFileNonexistantFile() {
        System.out.println("readBigFile nonexistant file");
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            File file = new File("nonexistant.txt");
            FileUtils.readBigFile(file);
        });

        String expectedMessage = "Source file doesn't exist!";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testRead() throws Exception {
        System.out.println("read");
        File file = new File("src/test/resources/code.txt");
        List<String> result = FileUtils.read(file);
        assertEquals(6, result.size());
    }

    @Test
    public void testReadNonexistantFile() {
        System.out.println("readBigFile nonexistant file");
        Exception exception = assertThrows(NoSuchFileException.class, () -> {
            File file = new File("nonexistant.txt");
            FileUtils.read(file);
        });

        String expectedMessage = "nonexistant.txt";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testGetExtension() {
        System.out.println("getExtension");
        File file = new File("src/test/resources/code.txt");
        String expResult = "txt";
        Optional<String> result = FileUtils.getExtension(file);
        assertEquals(expResult, result.get());
    }

    @Test
    public void testGetEmptyExtension() {
        System.out.println("getEmptyExtension");
        File file = new File("src/test/resources/noextensionfile");
        Optional<String> expResult = Optional.empty();
        Optional<String> result = FileUtils.getExtension(file);
        assertEquals(expResult, result);
    }
}
