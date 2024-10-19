package awt.closeAWTWindow;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import awt.windowListener.WindowExample;

public class ImplementingWindowListenerExample extends Frame implements WindowListener {
	
	// constructor
	ImplementingWindowListenerExample() {    

		// adding WindowListener to frame  
        addWindowListener(this);    
     
        // setting the size, layout and visibility of frame  
        setSize(400,400);    
        setLayout(null);    
        setVisible(true);    
    }

	// main method  
	public static void main(String[] args) {
		new ImplementingWindowListenerExample();
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		dispose();
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent arg0) {
	}
}
