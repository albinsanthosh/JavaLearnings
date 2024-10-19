package swing.jOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneExample3 {
	JFrame f;

	OptionPaneExample3(){  
	    f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Enter Name");      
	}

	public static void main(String[] args) {
		new OptionPaneExample3();
	}
}
