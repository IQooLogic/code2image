package rs.devlabs.code2img.lexers;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.devlabs.code2img.Lexer;
import rs.devlabs.code2img.Token;
import rs.devlabs.code2img.TokenType;

/**
 * This is a default, and abstract implementation of a Lexer using JFLex with
 * some utility methods that Lexers can implement.
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public abstract class DefaultJFlexLexer implements Lexer {

    protected long tokenStart;
    protected long tokenLength;
    protected long offset;

    /**
     * Create and return a Token of given type from start with length offset is
     * added to start
     *
     * @param type TokenType
     * @param start
     * @param length
     * @return return a Token of given type
     */
    protected Token token(TokenType type, long start, long length) {
        return new Token(type, start + offset, length);
    }

    /**
     * Create and return a Token of given type. start is obtained from
     * {@link DefaultJFlexLexer#yychar()} and length from
     * {@link DefaultJFlexLexer#yylength()} offset is added to start
     *
     * @param type TokenType
     * @return return a Token of given type
     */
    protected Token token(TokenType type) {
        return new Token(type, yychar() + offset, yylength());
    }

    /**
     * Create and return a Token of given type and pairValue. start is obtained
     * from {@link DefaultJFlexLexer#yychar()} and length from
     * {@link DefaultJFlexLexer#yylength()} offset is added to start
     *
     * @param type TokenType
     * @param pairValue
     * @return return a Token of given type
     */
    protected Token token(TokenType type, long pairValue) {
        return new Token(type, yychar() + offset, yylength(), (byte) pairValue);
    }

    /**
     * The DefaultJFlexLexer simply calls the yylex method of a JFlex compatible
     * Lexer and adds the tokens obtained to an ArrayList.
     */
    @Override
    public List<Token> parse(String segment, int offset) {
        List<Token> tokens = new ArrayList<>();
        try {
            CharArrayReader reader = new CharArrayReader(segment.toCharArray(), 0, segment.length());
            yyreset(reader);
            this.offset = offset;
            for (Token t = yylex(); t != null; t = yylex()) {
                tokens.add(t);
            }
        } catch (IOException ex) {
            Logger.getLogger(DefaultJFlexLexer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tokens;
    }

    /**
     * This will be called to reset the the lexer.This is created automatically
     * by JFlex.
     *
     * @param reader
     */
    public abstract void yyreset(Reader reader);

    /**
     * This is called to return the next Token from the Input Reader
     *
     * @return next token, or null if no more tokens.
     * @throws java.io.IOException
     */
    public abstract Token yylex() throws java.io.IOException;

    /**
     * Returns the character at position <tt>pos</tt> from the matched text.
     *
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch. A value from 0 to
     * yylength()-1.
     *
     * @return the character at position pos
     */
    public abstract char yycharat(int pos);

    /**
     * Returns the length of the matched text region.This method is
     * automatically implemented by JFlex lexers
     *
     * @return length of the matched text region
     */
    public abstract int yylength();

    /**
     * Returns the text matched by the current regular expression.This method is
     * automatically implemented by JFlex lexers
     *
     * @return text matched by the current regular expression
     */
    public abstract String yytext();

    /**
     * Return the char number from beginning of input stream.This is NOT
     * implemented by JFlex, so the code must be added to create this and return
     * the private yychar field
     *
     * @return char number from beginning of input stream
     */
    public abstract long yychar();
}
