package rs.devlabs.code2img.utils;

import java.io.File;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import rs.devlabs.code2img.Lexer;
import rs.devlabs.code2img.lexers.JavaLexer;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class LexerUtilsTest {

    @Test
    public void testGetLexerByExtension() {
        System.out.println("chooseLexerForFile for known extension");
        File fileToConvert = new File("src/test/resources/code.txt");
        Lexer result = LexerUtils.chooseLexerForFile(fileToConvert);
        assertTrue(result instanceof JavaLexer);
    }

    @Test
    public void testGetLexerForEmptyExtension() {
        System.out.println("chooseLexerForFile for uknown extension");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            File fileToConvert = new File("src/test/resources/noextensionfile");
            LexerUtils.chooseLexerForFile(fileToConvert);
        });

        String expectedMessage = "File doesn't have extension!";
        String actualMessage = exception.getMessage();
        System.out.println(exception.getMessage());
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testGetLexerForUnknownExtension() {
        System.out.println("chooseLexerForFile for uknown extension");
        Exception exception = assertThrows(RuntimeException.class, () -> {
            File fileToConvert = new File("src/test/resources/unknownextensionfile.py");
            LexerUtils.chooseLexerForFile(fileToConvert);
        });

        String expectedMessage = "Can not find lexer for file extension 'py'!";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
