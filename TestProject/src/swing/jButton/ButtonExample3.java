package swing.jButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//displaying image on the button
public class ButtonExample3 {
	ButtonExample3() {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton(new ImageIcon("C:\\Users\\AS00776261\\Desktop\\talex.png"));
		b.setBounds(100, 100, 100, 40);
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ButtonExample3();
	}
}
