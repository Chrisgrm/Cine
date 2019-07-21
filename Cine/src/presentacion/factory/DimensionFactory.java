package presentacion.factory;

import java.awt.*;

public class DimensionFactory {
    private DimensionFactory() {
    }

    public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int WIDTH = (int) screenSize.getWidth();
    public static final int HEIGHT = (int) screenSize.getHeight();

    public static int getWidth(double percent) {
        return (int) (WIDTH * (percent / 100.0));
    }

    public static int getHeight(double percent) {
        return (int) (HEIGHT * (percent / 100.0));
    }

    public static Dimension getDimension(double percent) {
        return new Dimension(getWidth(percent), getHeight(percent));
    }
}
