import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Graphics;
public class CO5_6 extends Applet implements ItemListener {
    Choice ch;
    int opt;
    public void init(){
        Label lab;
        lab = new Label("SELECT AN OPTION:");
        add(lab); 
        ch = new Choice();
        ch.addItem("CHOOSE ONE FROM THE CHOICEBOX");
        ch.addItem("Rectangle");
        ch.addItem("Triangle");
        ch.addItem("Square");
        ch.addItem("Circle");
        ch.addItemListener(this);
        add(ch);
    }
    public void paint(Graphics d){
        if(opt==0){
        }
        if(opt==1){
            d.drawRect(100, 50, 150, 100);
        }
        if(opt==2) {
            int[] x = new int[]{150, 70, 250};
            int[] y = new int[]{55, 150, 150};
            d.drawPolygon(x,y,3);
            d.drawPolygon(x,y,3);
        }
        if(opt==3) {
            d.drawRect(50, 50, 100, 100);
        }
        if(opt==4) {
            d.drawOval(50, 50, 100, 100);
        }
    }
    public void itemStateChanged (ItemEvent e)
    {
        opt = ch.getSelectedIndex();
        repaint();
    }
}