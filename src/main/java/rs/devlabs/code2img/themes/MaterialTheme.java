package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class MaterialTheme implements Theme {

    protected MaterialTheme() {
    }

    @Override
    public Color background() {
        return new Color(38, 50, 56);
    }

    @Override
    public Color foreground() {
        return new Color(233, 237, 237);
    }

    @Override
    public Color operator() {
        return new Color(233, 237, 237);
    }

    @Override
    public Color keyword() {
        return new Color(199, 146, 234);
    }

    @Override
    public Color identifier() {
        return new Color(130, 177, 255);
    }

    @Override
    public Color number() {
        return new Color(247, 118, 105);
    }

    @Override
    public Color string() {
        return new Color(195, 232, 141);
    }

    @Override
    public Color comment() {
        return new Color(84, 110, 122);
    }

    @Override
    public Color type() {
        return new Color(222, 203, 107);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(84, 110, 122);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(84, 110, 122);
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
