package swing.jFileChooser;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

// JFileChooser(File, FileSystemView)
public class JFileChooserExample8 {
	public static void main(String[] args) {
		// Added this block for viewing
		JFrame f = new JFrame("Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		// creating object to the JFileChooser class
		// File class
		File f1 = new File("/Desktop");
		JFileChooser jf = new JFileChooser(f1, FileSystemView.getFileSystemView());// parameterised constructor
																					// JFileChooser( file ) is called.
		jf.showSaveDialog(null); // opening the saved dialogue
	}
}
