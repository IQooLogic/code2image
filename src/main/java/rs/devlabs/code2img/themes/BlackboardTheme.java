package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class BlackboardTheme implements Theme {

    protected BlackboardTheme() {
    }

    @Override
    public Color background() {
        return new Color(12, 16, 33);
    }

    @Override
    public Color foreground() {
        return new Color(248, 248, 248);
    }

    @Override
    public Color operator() {
        return new Color(255, 255, 255);
    }

    @Override
    public Color keyword() {
        return new Color(251, 222, 45);
    }

    @Override
    public Color identifier() {
        return new Color(255, 100, 0);
    }

    @Override
    public Color number() {
        return new Color(216, 250, 60);
    }

    @Override
    public Color string() {
        return new Color(97, 206, 60);
    }

    @Override
    public Color comment() {
        return new Color(174, 174, 174);
    }

    @Override
    public Color type() {
        return new Color(248, 248, 248);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(136, 136, 136);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(136, 136, 136);
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
