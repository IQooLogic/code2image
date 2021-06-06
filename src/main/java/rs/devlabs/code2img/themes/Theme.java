package rs.devlabs.code2img.themes;

import java.awt.Color;
import rs.devlabs.code2img.TokenType;
import static rs.devlabs.code2img.TokenType.COMMENT2;
import static rs.devlabs.code2img.TokenType.KEYWORD2;
import static rs.devlabs.code2img.TokenType.STRING2;
import static rs.devlabs.code2img.TokenType.TYPE2;
import static rs.devlabs.code2img.TokenType.TYPE3;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public interface Theme {

    Color background();

    Color foreground();

    Color operator();

    Color keyword();

    Color identifier();

    Color number();

    Color string();

    Color comment();

    Color type();

    Color lineNumbersColor();

    Color createdByTextColor();

    Color exitButtonColor();

    Color maximizeButtonColor();

    Color minimizeButtonColor();

    default Color getColorForTokenType(TokenType type) {
        return switch (type) {
            case KEYWORD, KEYWORD2 ->
                keyword();
            case IDENTIFIER ->
                identifier();
            case OPERATOR ->
                operator();
            case NUMBER ->
                number();
            case STRING, STRING2 ->
                string();
            case TYPE, TYPE2, TYPE3 ->
                type();
            case COMMENT, COMMENT2 ->
                comment();
            case DEFAULT ->
                foreground();
            default ->
                foreground();
        };
    }

    default Color hexToColor(String hex) {
        // one digit is 1 byte -> 8 bits -> 2^8 - 1 = 255 (-1 jer predstavljamo i 0 pa mozemo samo 255 kombinacija razlicitih da imamo i li je to za znak?)
        // sa 2 hex chara mogu da predstavim 255 razlicitih brojeva ?
        hex = hex.replace("#", "");

        return switch (hex.length()) {
            case 3 ->
                new Color(
                Integer.valueOf(hex.substring(0, 1), 16) * 255,
                Integer.valueOf(hex.substring(1, 2), 16) * 255,
                Integer.valueOf(hex.substring(2, 3), 16) * 255);
            case 6 ->
                Color.decode(hex);
            case 8 ->
                new Color(
                Integer.valueOf(hex.substring(0, 2), 16),
                Integer.valueOf(hex.substring(2, 4), 16),
                Integer.valueOf(hex.substring(4, 6), 16),
                Integer.valueOf(hex.substring(6, 8), 16));
            default ->
                throw new IllegalArgumentException(String.format("Hex color '%s' is not valid!", hex));
        };
    }
}
