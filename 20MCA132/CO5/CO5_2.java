import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CO5_2 extends Applet implements ActionListener {
	TextField t1 = new TextField(5);
	TextField t2 = new TextField(5);
	TextField t3 = new TextField(5);
	TextField t4 = new TextField(5);
	TextField t5 = new TextField(25);
	Label l1 = new Label("Number 1: ");
	Label l2 = new Label("Number 2: ");
	Label l3 = new Label("Number 3: ");
	Label l4 = new Label("Result:");
	Button bn = new Button("Find Max");
	
	public void init() {
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(t5);
		add(bn);
		
		bn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == bn){
			int b1 = Integer.parseInt(t1.getText());
			int b2 = Integer.parseInt(t2.getText());
			int b3 = Integer.parseInt(t3.getText());
			
			int max = Math.max(b1, Math.max(b2, b3));
            t4.setText(" " + max);
			
			if(b1>b2 && b1>b3)
			{
				t5.setText("First Number is greatest");
			}else if(b2>b1 && b2>b3)
			{
				t5.setText("Second Number is greatest");
			}else
			{
				t5.setText("Third Number is greatest");
			}
		}
	}
}


			
			
	
	