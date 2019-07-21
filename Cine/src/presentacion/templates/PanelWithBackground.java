package presentacion.templates;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelWithBackground extends JPanel {
    private Image background;

    public void paintComponent(Graphics g) {
        if (this.background != null) {
            g.drawImage(this.background, 0, 0, this.getSize().width, this.getSize().height, null);
        }
        super.paintComponent(g);
    }

    protected void setBackground(String imagePath) {
        this.setOpaque(false);
        this.background = new ImageIcon(imagePath).getImage();
        repaint();
    }

}
