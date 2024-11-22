package swing.jFileChooser;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

// JFileChooser(String currentDirectoryPath, FileSystemViewfsv)
public class JFileChooserExample6 {

	public static void main(String[] args) {
		// Added this block for viewing
		JFrame f = new JFrame("Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		// creating object to the JFileChooser class
		JFileChooser jf = new JFileChooser("/", FileSystemView.getFileSystemView());// parameterised constructor
																					// JFileChooser( String
																					// currentDirectoryPath,
																					// FileSystemViewfsv ) is called.
		jf.showSaveDialog(null); // opening the saved dialogue
	}
}
