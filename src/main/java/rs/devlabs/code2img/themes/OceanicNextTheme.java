package rs.devlabs.code2img.themes;

import java.awt.Color;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class OceanicNextTheme implements Theme {

    protected OceanicNextTheme() {
    }

    @Override
    public Color background() {
        return new Color(48, 65, 72);
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
        return new Color(197, 148, 197);
    }

    @Override
    public Color identifier() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color number() {
        return new Color(249, 145, 87);
    }

    @Override
    public Color string() {
        return new Color(153, 199, 148);
    }

    @Override
    public Color comment() {
        return new Color(101, 115, 126);
    }

    @Override
    public Color type() {
        return new Color(248, 248, 242);
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
