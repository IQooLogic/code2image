package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class VSCodeTheme implements Theme {

    protected VSCodeTheme() {
    }

    @Override
    public Color background() {
        return new Color(30, 30, 30);
    }

    @Override
    public Color foreground() {
        return new Color(212, 212, 212);
    }

    @Override
    public Color operator() {
        return new Color(212, 212, 212);
    }

    @Override
    public Color keyword() {
        return new Color(197, 134, 192);
    }

    @Override
    public Color identifier() {
        return new Color(156, 220, 254);
    }

    @Override
    public Color number() {
        return new Color(181, 206, 168);
    }

    @Override
    public Color string() {
        return new Color(206, 145, 120);
    }

    @Override
    public Color comment() {
        return new Color(106, 153, 85);
    }

    @Override
    public Color type() {
        return new Color(212, 212, 212);
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
