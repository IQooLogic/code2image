package rs.devlabs.code2img.utils;

import java.io.File;
import java.util.Optional;
import rs.devlabs.code2img.Lexer;
import rs.devlabs.code2img.lexers.JavaLexer;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class LexerUtils {

    private LexerUtils() {
    }

    public static Lexer getLexerByExtension(File fileToConvert) throws IllegalArgumentException, RuntimeException {
        Optional<String> optExtension = FileUtils.getExtension(fileToConvert);
        if (!optExtension.isPresent()) {
            throw new IllegalArgumentException("File doesn't have extension!");
        }

        String extension = optExtension.get().toLowerCase();
        return switch (extension) {
            case "java", "txt" ->
                new JavaLexer();
            default ->
                throw new RuntimeException(String.format("Can not find lexer for file extension '%s'!", extension));
        };
    }
}
