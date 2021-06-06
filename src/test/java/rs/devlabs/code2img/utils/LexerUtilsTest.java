package rs.devlabs.code2img.utils;

import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import rs.devlabs.code2img.Lexer;
import rs.devlabs.code2img.lexers.DefaultJFlexLexer;
import rs.devlabs.code2img.lexers.JavaLexer;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class LexerUtilsTest {

    @Test
    public void testGetLexerByExtension() {
        System.out.println("getLexerByExtension");
        File fileToConvert = new File("src/test/resources/code.txt");
        DefaultJFlexLexer instance = new JavaLexer();
        Lexer result = LexerUtils.getLexerByExtension(fileToConvert);
        assertTrue(result instanceof JavaLexer);
    }
}
