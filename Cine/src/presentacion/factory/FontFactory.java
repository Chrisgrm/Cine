package presentacion.factory;

import java.awt.Font;
import java.io.File;
import java.io.InputStream;

public class FontFactory {
    private FontFactory() {
    }

    private static Font font = null;

    public static Font getFont(String fontName, int style, float size) {
        try {
            InputStream is = FontFactory.class.getResourceAsStream("/recursos/fuentes/" + fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        return font.deriveFont(style, size);
    }
}