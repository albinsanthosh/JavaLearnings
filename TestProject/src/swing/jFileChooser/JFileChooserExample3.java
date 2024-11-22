package swing.jFileChooser;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

// JFileChooser(File currentDirectory, FileSystemViewfsv)
public class JFileChooserExample3 {
	public static void main(String[] args) {
		
		// Added this block for viewing
		JFrame f = new JFrame("Panel Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
				
		// creating object to the JFileChooser class
		JFileChooser jf = new JFileChooser("c:", FileSystemView.getFileSystemView()); // parameterised constructor
																						// JFileChooser(File
																						// currentDirectory,
																						// FileSystemViewfsv) is called.
		jf.showSaveDialog(null); // opening the saved dialogue
	}
}
