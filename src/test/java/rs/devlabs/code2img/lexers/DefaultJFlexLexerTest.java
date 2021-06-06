package rs.devlabs.code2img.lexers;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import rs.devlabs.code2img.Token;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class DefaultJFlexLexerTest {

    @Test
    public void testParse() {
        System.out.println("parse");
        String segment = "int y = 10; String str = \"HelloWorld!\", str2 = \"Must have dot.\";";
        int offset = 0;
        DefaultJFlexLexer instance = new JavaLexer();
        List<Token> result = instance.parse(segment, offset);
        assertEquals(14, result.size());
    }
}
