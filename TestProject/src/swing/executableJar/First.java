package swing.executableJar;

import javax.swing.JButton;
import javax.swing.JFrame;

// create myfile.mf containing Main-Class: First
// Note: In mf file, new line is must after the class name.
// In class folder with mf file
// jar -cvmf myfile.mf myjar.jar First.class  

public class First {
	First() {
		JFrame f = new JFrame();

		JButton b = new JButton("click");
		b.setBounds(130, 100, 100, 40);

		f.add(b);

		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new First();
	}

}
