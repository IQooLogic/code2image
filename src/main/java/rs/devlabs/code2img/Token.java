package rs.devlabs.code2img;

import java.io.Serializable;

/**
 * A Token in a Document. Tokens do NOT store a reference to the underlying
 * SyntaxDocument, and must generally be obtained from the SyntaxDocument
 * methods. The reason for not storing the SyntaxDocument is simply for memory,
 * as the number of Tokens per document can be large, you may end up with twice
 * the memory in a SyntaxDocument with Tokens than a simple PlainDocument.
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class Token implements Serializable, Comparable {

    public final TokenType type;
    public final long start;
    public final long length;
    /**
     * the pair value to use if this token is one of a pair: This is how it is
     * used: The opening part will have a positive number X The closing part
     * will have a negative number X X should be unique for a pair: e.g. for [
     * pairValue = +1 for ] pairValue = -1
     */
    public final byte pairValue;
    /**
     * The kind of the Document. This is only needed if proper Parsing of a
     * document is needed and it makes certain operations faster. You can use
     * any of the supplied Generic Values, or create your language specific uses
     * by using USER_FIRST + x;
     */
    public final short kind = 0;

    /**
     * Constructs a new token
     *
     * @param type
     * @param start
     * @param length
     */
    public Token(TokenType type, long start, long length) {
        this.type = type;
        this.start = start;
        this.length = length;
        this.pairValue = 0;
    }

    /**
     * Construct a new part of pair token
     *
     * @param type
     * @param start
     * @param length
     * @param pairValue
     */
    public Token(TokenType type, long start, long length, byte pairValue) {
        this.type = type;
        this.start = start;
        this.length = length;
        this.pairValue = pairValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Token token) {
            return ((this.start == token.start)
                    && (this.length == token.length)
                    && (this.type.equals(token.type)));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Long.valueOf(start).hashCode();
    }

    @Override
    public String toString() {
        if (pairValue == 0) {
            return String.format("%s (%d, %d)", type, start, length);
        } else {
            return String.format("%s (%d, %d) (%d)", type, start, length, pairValue);
        }
    }

    @Override
    public int compareTo(Object o) {
        Token t = (Token) o;
        if (this.start != t.start) {
            return (int) (this.start - t.start);
        } else if (this.length != t.length) {
            return (int) (this.length - t.length);
        } else {
            return this.type.compareTo(t.type);
        }
    }

    /**
     * return the end position of the token.
     *
     * @return start + length
     */
    public long end() {
        return start + length;
    }
}
