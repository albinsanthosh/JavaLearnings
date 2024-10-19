package awt.adaptorClasses;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterExample {
	
	// object of Frame
	Frame f;

	// class constructor  
	WindowAdapterExample() {    
		
		// creating a frame with the title  
        f = new Frame ("Window Adapter");    

        // adding the WindowListener to the frame  
        // overriding the windowClosing() method   
        f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
            }    
        });    
         
        // setting the size, layout and   
        f.setSize (400, 400);    
        f.setLayout (null);    
        f.setVisible (true);    
    }

	// main method  
	public static void main(String[] args) {
		new WindowAdapterExample();
	}
}
