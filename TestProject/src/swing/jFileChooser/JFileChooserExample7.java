package swing.jFileChooser;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChooserExample7 {

	public static void main(String[] args) {
		// Added this block for viewing
		JFrame f = new JFrame("Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		// creating object to the JFileChooser class
		JFileChooser jf = new JFileChooser(new File("/Desktop/Dev"));// parameterised constructor JFileChooser( file )
																		// is called.
		jf.showSaveDialog(null); // opening the saved dialogue
	}
}
