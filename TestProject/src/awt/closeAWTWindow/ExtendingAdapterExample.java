package awt.closeAWTWindow;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExtendingAdapterExample extends WindowAdapter{
	// object of Frame
	Frame f;

	// class constructor  
	ExtendingAdapterExample() {    

		// creating the frame  
        f = new Frame();    

        // adding  WindowListener to the frame  
        f.addWindowListener(this);    
        

        // setting the size, layout and visibility of frame  
        f.setSize (400, 400);    
        f.setLayout (null);    
        f.setVisible (true);    
    }

	// overriding the windowClosing() method   
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	// main method  
	public static void main(String[] args) {
		new ExtendingAdapterExample();
	}
}
