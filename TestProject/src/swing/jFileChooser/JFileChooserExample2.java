package swing.jFileChooser;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFileChooser(File currentDirectory)
public class JFileChooserExample2 {

	public static void main(String[] args) { 
		
		// Added this block for viewing
		JFrame f = new JFrame("Panel Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
        // creating object to the JFileChooser class  
        JFileChooser jf = new JFileChooser("c:"); // parameterised constructor JFileChooser( File currentDirectory) is called.  
        jf.showSaveDialog(null); // opening the saved dialogue  
    }  
}
