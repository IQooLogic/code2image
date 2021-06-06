package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class Base16LightTheme implements Theme {

    protected Base16LightTheme() {
    }

    @Override
    public Color background() {
        return new Color(245, 245, 245);
    }

    @Override
    public Color foreground() {
        return new Color(32, 32, 32);
    }

    @Override
    public Color operator() {
        return new Color(0, 0, 0);
    }

    @Override
    public Color keyword() {
        return new Color(172, 65, 66);
    }

    @Override
    public Color identifier() {
        return new Color(144, 169, 89);
    }

    @Override
    public Color number() {
        return new Color(170, 117, 159);
    }

    @Override
    public Color string() {
        return new Color(244, 191, 117);
    }

    @Override
    public Color comment() {
        return new Color(143, 85, 54);
    }

    @Override
    public Color type() {
        return new Color(32, 32, 32);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(176, 176, 176);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(176, 176, 176);
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
