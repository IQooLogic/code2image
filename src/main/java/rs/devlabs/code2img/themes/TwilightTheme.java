package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class TwilightTheme implements Theme {

    protected TwilightTheme() {
    }

    @Override
    public Color background() {
        return new Color(20, 20, 20);
    }

    @Override
    public Color foreground() {
        return new Color(96, 115, 146);
    }

    @Override
    public Color operator() {
        return new Color(205, 168, 105);
    }

    @Override
    public Color keyword() {
        return new Color(249, 238, 152);
    }

    @Override
    public Color identifier() {
        return new Color(96, 115, 146);
    }

    @Override
    public Color number() {
        return new Color(202, 120, 65);
    }

    @Override
    public Color string() {
        return new Color(143, 157, 106);
    }

    @Override
    public Color comment() {
        return new Color(119, 119, 119);
    }

    @Override
    public Color type() {
        return new Color(96, 115, 146);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(170, 170, 170);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(170, 170, 170);
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
