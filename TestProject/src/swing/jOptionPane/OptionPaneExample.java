package swing.jOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneExample {
	JFrame f;

	OptionPaneExample() {
		f = new JFrame();
		JOptionPane.showMessageDialog(f, "Hello, Welcome to Javatpoint.");
	}

	public static void main(String[] args) {
		new OptionPaneExample();
	}
}
