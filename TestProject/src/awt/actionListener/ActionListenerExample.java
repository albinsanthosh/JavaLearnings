package awt.actionListener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// modified as giving error
//1st step  
public class ActionListenerExample implements ActionListener {
	final TextField tf = new TextField();
	
	public ActionListenerExample() {
		Frame f = new Frame("ActionListener Example");	
		tf.setBounds(50, 50, 150, 20);
		Button b = new Button("Click Here");
		b.setBounds(50, 100, 60, 30);
		// 2nd step
		b.addActionListener(this);
		f.add(b);
		f.add(tf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionListenerExample();
	}

	// 3rd step
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome to Javatpoint.");
	}
}
