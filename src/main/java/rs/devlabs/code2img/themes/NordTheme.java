package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class NordTheme implements Theme {

    protected NordTheme() {
    }

    @Override
    public Color background() {
        return new Color(46, 52, 64);
    }

    @Override
    public Color foreground() {
        return new Color(216, 222, 233);
    }

    @Override
    public Color operator() {
        return new Color(129, 161, 193);
    }

    @Override
    public Color keyword() {
        return new Color(129, 161, 193);
    }

    @Override
    public Color identifier() {
        return new Color(136, 192, 208);
    }

    @Override
    public Color number() {
        return new Color(180, 142, 173);
    }

    @Override
    public Color string() {
        return new Color(163, 190, 140);
    }

    @Override
    public Color comment() {
        return new Color(76, 86, 106);
    }

    @Override
    public Color type() {
        return new Color(216, 222, 233);
    }

    @Override
    public Color lineNumbersColor() {
        return hexToColor("#d8dee966");
    }

    @Override
    public Color createdByTextColor() {
        return hexToColor("#d8dee966");
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
