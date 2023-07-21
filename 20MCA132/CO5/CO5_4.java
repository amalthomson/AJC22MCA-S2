import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class CO5_4 extends Applet {
    private Color doorColor;
    public void init() {
        doorColor = Color.BLUE;
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (doorColor == Color.BLUE) {
                    doorColor = Color.RED;
                } else {
                    doorColor = Color.BLUE;
                }
                repaint();
            }
        });
    }
    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(100, 100, 200, 200);
        g.setColor(Color.RED);
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {100, 50, 100};
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(doorColor);
        g.fillRect(160, 240, 80, 60);
    }
}