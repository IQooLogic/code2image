package rs.devlabs.code2img.themes;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Miloš Stojković <milos@ast.co.rs>
 */
public final class Fonts {

    public static final Font DEFAULT = new Font(Font.MONOSPACED, Font.PLAIN, 14);
    public static final Font ANONYMOUS_PRO = new Font("Anonymous Pro", Font.PLAIN, 14);
    public static final Font COUSINE = new Font("Cousine", Font.PLAIN, 14);
    public static final Font DEJAVU_SANS_MONO = new Font("DejaVu Sans Mono", Font.PLAIN, 14);
    public static final Font DROID_SANS_MONO = new Font("Droid Sans Mono", Font.PLAIN, 14);
    public static final Font FIRA_CODE = new Font("Fira Code", Font.PLAIN, 14);
    public static final Font FIRA_MONO = new Font("Fira Mono", Font.PLAIN, 14);
    public static final Font HACK = new Font("Hack", Font.PLAIN, 14);
    public static final Font HERMIT = new Font("Hermit", Font.PLAIN, 14);
    public static final Font IBM_PLEX_MONO = new Font("IBM Plex Mono", Font.PLAIN, 14);
    public static final Font INCONSOLATA = new Font("Inconsolata", Font.PLAIN, 14);
    public static final Font JETBRAINS_MONO = new Font("JetBrains Mono NL", Font.PLAIN, 14);
    public static final Font OXYGEN_MONO = new Font("Oxygen Mono", Font.PLAIN, 14);
    public static final Font PT_MONO = new Font("PT Mono", Font.PLAIN, 14);
    public static final Font ROBOTO_MONO = new Font("Roboto Mono", Font.PLAIN, 14);
    public static final Font SOURCE_CODE_PRO = new Font("Source Code Pro", Font.PLAIN, 14);
    public static final Font SPACE_MONO = new Font("Space Mono", Font.PLAIN, 14);
    public static final Font UBUNTU_MONO = new Font("Ubuntu Mono", Font.PLAIN, 14);

    public static Font customFont(String ttf, int style, float size) throws FileNotFoundException, FontFormatException, IOException {
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("fonts/" + ttf + ".ttf");
        return Font.createFont(Font.TRUETYPE_FONT, in).deriveFont(style, size);
    }

    private Fonts() {
    }

}
