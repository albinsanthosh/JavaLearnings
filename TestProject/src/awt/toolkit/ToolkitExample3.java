package awt.toolkit;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class ToolkitExample3 {
	ToolkitExample3(){   
		Frame f=new Frame();   
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\AS00776261\\Desktop\\talex.png");  
		f.setIconImage(icon);  
		f.setLayout(null);   
		f.setSize(400,400);   
		f.setVisible(true);   
		}

	public static void main(String args[]) {
		new ToolkitExample3();
	}
}
