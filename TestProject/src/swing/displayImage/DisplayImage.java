package swing.displayImage;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class DisplayImage extends Canvas {

	public void paint(Graphics g) {

		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("p3.gif");
		g.drawImage(i, 120, 100, this);

	}

	public static void main(String[] args) {
		DisplayImage m = new DisplayImage();
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
