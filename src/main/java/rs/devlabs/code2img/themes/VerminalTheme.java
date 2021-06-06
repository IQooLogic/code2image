package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class VerminalTheme implements Theme {

    protected VerminalTheme() {
    }

    @Override
    public Color background() {
        return new Color(38, 38, 38);
    }

    @Override
    public Color foreground() {
        return new Color(255, 255, 255);
    }

    @Override
    public Color operator() {
        return new Color(250, 120, 195);
    }

    @Override
    public Color keyword() {
        return new Color(154, 225, 255);
    }

    @Override
    public Color identifier() {
        return new Color(255, 155, 163);
    }

    @Override
    public Color number() {
        return new Color(209, 154, 102);
    }

    @Override
    public Color string() {
        return new Color(152, 195, 121);
    }

    @Override
    public Color comment() {
        return new Color(92, 99, 112);
    }

    @Override
    public Color type() {
        return new Color(255, 255, 255);
    }

    @Override
    public Color lineNumbersColor() {
        return new Color(97, 97, 97);
    }

    @Override
    public Color createdByTextColor() {
        return new Color(97, 97, 97);
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
