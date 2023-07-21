import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class CO5_3 extends Applet implements ActionListener {
    TextField t1,t2,t3,t4,t5,t6;
    Button b;
    public void init(){
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        t6 = new TextField();
        b = new Button(":: RESULT ::");
        b.setBounds(50,250,90,30);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        float m1, m2,m3, m4,m5,percent;
        m1= Float.parseFloat(t1.getText());
        m2= Float.parseFloat(t2.getText());
        m3= Float.parseFloat(t3.getText());
        m4= Float.parseFloat(t4.getText());
        m5= Float.parseFloat(t5.getText());
        percent=((m1+m2+m3+m4+m5)*100)/500;
        t6.setText(String.valueOf(percent));
        repaint();
        }
    public void paint(Graphics g){
        float p;
        p = Float.parseFloat(t6.getText());
        if(p > 50.0) {
            g.drawOval(80,300,240,240);
            g.drawOval(130,350,50,50);
            g.drawOval(220,350,50,50);
            g.drawArc(150,400,100,90,200,150); 
        }
        else {
            g.drawOval(80,300,240,240);
            g.drawOval(130,350,50,50);
            g.drawOval(220,350,50,50);
            g.drawArc(150,450,100,90,15,150); 
        }
    }
}