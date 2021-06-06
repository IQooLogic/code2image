package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class OneDarkTheme implements Theme {

    protected OneDarkTheme() {
    }

    @Override
    public Color background() {
        return new Color(40, 44, 52);
    }

    @Override
    public Color foreground() {
        return new Color(171, 178, 191);
    }

    @Override
    public Color operator() {
        return new Color(86, 182, 194);
    }

    @Override
    public Color keyword() {
        return new Color(198, 120, 221);
    }

    @Override
    public Color identifier() {
        return new Color(224, 108, 117);
    }

    @Override
    public Color number() {
        return new Color(209, 154, 102);
    }

    @Override
    public Color string() {
        return new Color(152, 195, 121);
    }

    @Override
    public Color comment() {
        return new Color(92, 99, 112);
    }

    @Override
    public Color type() {
        return new Color(171, 178, 191);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(92, 99, 112);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(92, 99, 112);
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
