package Services;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Desktop extends JDesktopPane {

    private Image x;

    public Desktop(String Imagem) {
        this.x = new ImageIcon(Imagem).getImage();
    }

    public Desktop() {
      
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(x, 0, 0, getWidth(), getHeight(), this);

    }
}
