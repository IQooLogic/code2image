package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class A11yDarkTheme implements Theme {

    protected A11yDarkTheme() {
    }

    @Override
    public Color background() {
        return new Color(43, 43, 43);
    }

    @Override
    public Color foreground() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color operator() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color keyword() {
        return new Color(255, 160, 122);
    }

    @Override
    public Color identifier() {
        return new Color(0, 224, 224);
    }

    @Override
    public Color number() {
        return new Color(220, 198, 224);
    }

    @Override
    public Color string() {
        return new Color(255, 215, 0);
    }

    @Override
    public Color comment() {
        return new Color(212, 208, 171);
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
