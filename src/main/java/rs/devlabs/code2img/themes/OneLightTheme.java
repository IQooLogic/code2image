package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class OneLightTheme implements Theme {

    protected OneLightTheme() {
    }

    @Override
    public Color background() {
        return new Color(250, 250, 250);
    }

    @Override
    public Color foreground() {
        return new Color(39, 41, 47);
    }

    @Override
    public Color operator() {
        return new Color(1, 132, 188);
    }

    @Override
    public Color keyword() {
        return new Color(166, 38, 164);
    }

    @Override
    public Color identifier() {
        return new Color(224, 108, 117);
    }

    @Override
    public Color number() {
        return new Color(152, 104, 1);
    }

    @Override
    public Color string() {
        return new Color(80, 161, 79);
    }

    @Override
    public Color comment() {
        return new Color(160, 161, 167);
    }

    @Override
    public Color type() {
        return new Color(39, 41, 47);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(146, 146, 146);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(146, 146, 146);
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
