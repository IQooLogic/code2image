package rs.devlabs.code2img.themes;

import java.awt.Color;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import rs.devlabs.code2img.TokenType;

/**
 *
 * @author Miloš Stojković <milos@ast.co.rs>
 */
public class ThemeTest {

    @Test
    public void testHexToColorForLength3() {
        System.out.println("hexToColor for 3 char hex");
        String hex = "#000";
        Theme instance = Themes.ONEDARK;
        Color expResult = Color.BLACK;
        Color result = instance.hexToColor(hex);
        assertEquals(expResult, result);
    }

    @Test
    public void testHexToColorForLength6() {
        System.out.println("hexToColor for 6 char hex");
        String hex = "#000000";
        Theme instance = Themes.ONEDARK;
        Color expResult = Color.BLACK;
        Color result = instance.hexToColor(hex);
        assertEquals(expResult, result);
    }

    @Test
    public void testHexToColorForLength8() {
        System.out.println("hexToColor for 8 char hex (with alpha)");
        String hex = "#000000ff";
        Theme instance = Themes.ONEDARK;
        Color expResult = Color.BLACK;
        Color result = instance.hexToColor(hex);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColorForTokenType() {
        System.out.println("getColorForTokenType");
        TokenType type = TokenType.OPERATOR;
        Theme instance = Themes.ONEDARK;
        Color expResult = Themes.ONEDARK.operator();
        Color result = instance.getColorForTokenType(type);
        assertEquals(expResult, result);
    }
}
