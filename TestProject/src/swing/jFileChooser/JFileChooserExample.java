package swing.jFileChooser;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChooserExample {
	public static void main(String[] args) {
		
		// Added this block for viewing
		JFrame f = new JFrame("Panel Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		// creating object to the JFileChooser class
		JFileChooser jf = new JFileChooser(); // default constructor JFileChooser is called.
		jf.showSaveDialog(null);
	}
}
