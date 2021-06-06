package rs.devlabs.code2img;

import java.util.List;

/**
 * Lexers must implement these methods. These are used in the Tokenizer
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public interface Lexer {

    /**
     * This is the only method a Lexer needs to implement.It will be passed a
     * Reader, and it should return non-overlapping Tokens for each recognized
     * token in the stream.
     *
     * @param segment Text to parse.
     * @param offset offset to add to start of each token (useful for nesting)
     * @return list of tokens
     */
    List<Token> parse(String segment, int offset);
}
