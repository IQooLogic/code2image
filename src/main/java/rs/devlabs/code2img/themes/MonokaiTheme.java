package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class MonokaiTheme implements Theme {

    protected MonokaiTheme() {
    }

    @Override
    public Color background() {
        return new Color(39, 40, 34);
    }

    @Override
    public Color foreground() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color operator() {
        return new Color(255, 255, 255);
    }

    @Override
    public Color keyword() {
        return new Color(249, 38, 114);
    }

    @Override
    public Color identifier() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color number() {
        return new Color(174, 129, 255);
    }

    @Override
    public Color string() {
        return new Color(230, 219, 116);
    }

    @Override
    public Color comment() {
        return new Color(117, 113, 94);
    }

    @Override
    public Color type() {
        return new Color(102, 217, 239);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(208, 208, 208);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(208, 208, 208);
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
