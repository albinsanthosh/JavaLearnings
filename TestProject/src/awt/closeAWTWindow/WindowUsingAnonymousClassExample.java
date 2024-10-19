package awt.closeAWTWindow;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import awt.windowListener.WindowExample;

public class WindowUsingAnonymousClassExample extends Frame {
	
	// class constructor
	WindowUsingAnonymousClassExample() {    

		// adding WindowListener to the Frame  
		// and using the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });    
        
        // setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }

	// main method  
	public static void main(String[] args) {
		new WindowUsingAnonymousClassExample();
	}
}
