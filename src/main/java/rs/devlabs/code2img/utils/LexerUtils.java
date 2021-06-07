package rs.devlabs.code2img.utils;

import java.io.File;
import java.util.List;
import java.util.Optional;
import rs.devlabs.code2img.Lexer;
import rs.devlabs.code2img.Token;
import rs.devlabs.code2img.lexers.JavaLexer;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public final class LexerUtils {

    private LexerUtils() {
    }

    private static Lexer lexer;

    public static List<Token> parse(String segment, int offset) {
        return lexer.parse(segment, offset);
    }

    public static Lexer chooseLexerForFile(File file) throws IllegalArgumentException, RuntimeException {
        Optional<String> optExtension = FileUtils.getExtension(file);
        if (!optExtension.isPresent()) {
            throw new IllegalArgumentException("File doesn't have extension!");
        }

        String extension = optExtension.get().toLowerCase();
        return switch (extension) {
            case "java", "txt" ->
                lexer = new JavaLexer();
            default ->
                throw new RuntimeException(String.format("Can not find lexer for file extension '%s'!", extension));
        };
    }
}
