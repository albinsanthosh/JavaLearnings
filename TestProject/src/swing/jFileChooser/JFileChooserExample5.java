package swing.jFileChooser;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

//JFileChooser(String currentDirectoryPath)
public class JFileChooserExample5 {

	public static void main(String[] args) {  
		// Added this block for viewing
		JFrame f = new JFrame("Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
				
        // creating object to the JFileChooser class  
        JFileChooser jf = new JFileChooser("/Users/albinsanthosh/Desktop"); // parameterised constructor JFileChooser(string current DirectoryPath) is called.  
        jf.showSaveDialog(null); // opening the saved dialogue  
    }
}
