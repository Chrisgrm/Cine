package presentacion.templates;

import presentacion.factory.FontFactory;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;

import javax.swing.JButton;


public class TemplateButton extends JButton {
    public TemplateButton() {
        setFocusPainted(false);
        setBackground(BLACK);
        setForeground(WHITE);
        setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
    }

}
