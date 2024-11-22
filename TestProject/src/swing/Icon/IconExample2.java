package swing.Icon;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import awt.toolkit.ToolkitExample;

public class IconExample2 {
	IconExample2(){   
		JFrame f=new JFrame();   
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");  
		f.setIconImage(icon);  
		f.setLayout(null);   
		f.setSize(200,200);   
		f.setVisible(true);   
		}

	public static void main(String args[]) {
		new IconExample2();
	}
}
