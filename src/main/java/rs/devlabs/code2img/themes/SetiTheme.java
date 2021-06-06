package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class SetiTheme implements Theme {

    protected SetiTheme() {
    }

    @Override
    public Color background() {
        return new Color(21, 23, 24);
    }

    @Override
    public Color foreground() {
        return new Color(207, 210, 209);
    }

    @Override
    public Color operator() {
        return new Color(159, 202, 86);
    }

    @Override
    public Color keyword() {
        return new Color(230, 205, 105);
    }

    @Override
    public Color identifier() {
        return new Color(85, 181, 219);
    }

    @Override
    public Color number() {
        return new Color(205, 63, 69);
    }

    @Override
    public Color string() {
        return new Color(85, 181, 219);
    }

    @Override
    public Color comment() {
        return new Color(65, 83, 91);
    }

    @Override
    public Color type() {
        return new Color(159, 202, 86);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(109, 138, 136);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(109, 138, 136);
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
