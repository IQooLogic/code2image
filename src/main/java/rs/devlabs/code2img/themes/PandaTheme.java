package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class PandaTheme implements Theme {

    protected PandaTheme() {
    }

    @Override
    public Color background() {
        return new Color(41, 42, 43);
    }

    @Override
    public Color foreground() {
        return new Color(230, 230, 230);
    }

    @Override
    public Color operator() {
        return new Color(243, 243, 243);
    }

    @Override
    public Color keyword() {
        return new Color(255, 117, 181);
    }

    @Override
    public Color identifier() {
        return new Color(255, 184, 108);
    }

    @Override
    public Color number() {
        return new Color(255, 184, 108);
    }

    @Override
    public Color string() {
        return new Color(25, 249, 216);
    }

    @Override
    public Color comment() {
        return new Color(103, 107, 121);
    }

    @Override
    public Color type() {
        return new Color(255, 154, 193);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(230, 230, 230);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(230, 230, 230);
    }

    @Override
    public Color exitButtonColor() {
        return new Color(255, 95, 86);
    }

    @Override
    public Color maximizeButtonColor() {
        return new Color(255, 189, 46);
    }

    @Override
    public Color minimizeButtonColor() {
        return new Color(39, 201, 63);
    }
}
