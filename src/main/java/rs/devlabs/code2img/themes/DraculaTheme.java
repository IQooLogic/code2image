package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class DraculaTheme implements Theme {

    protected DraculaTheme() {
    }

    @Override
    public Color background() {
        return new Color(34, 33, 44);
    }

    @Override
    public Color foreground() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color operator() {
        return new Color(255, 128, 191);
    }

    @Override
    public Color keyword() {
        return new Color(255, 128, 191);
    }

    @Override
    public Color identifier() {
        return new Color(138, 255, 128);
    }

    @Override
    public Color number() {
        return new Color(149, 128, 255);
    }

    @Override
    public Color string() {
        return new Color(255, 255, 128);
    }

    @Override
    public Color comment() {
        return new Color(121, 112, 169);
    }

    @Override
    public Color type() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(153, 153, 153);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(153, 153, 153);
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
