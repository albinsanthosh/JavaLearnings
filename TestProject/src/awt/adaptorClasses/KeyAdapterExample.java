package awt.adaptorClasses;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterExample extends KeyAdapter {
	// creating objects of Label, TextArea and Frame
	Label l;
	TextArea area;
	Frame f;

	// class constructor  
	KeyAdapterExample() {

		// creating the Frame with title  
		f = new Frame("Key Adapter");

		// creating the Label  
		l = new Label();

		// setting the location of label   
		l.setBounds(20, 50, 200, 20);

		// creating the text area  
		area = new TextArea();

		// setting the location of text area    
		area.setBounds(20, 80, 300, 300);

		// adding KeyListener to text area  
		area.addKeyListener(this);
		
		// adding the label and text area to frame
		f.add(l);
		f.add(area);

		// setting the size, layout and visibility of frame  
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}


	// overriding the keyReleased() method   
	public void keyReleased(KeyEvent e) {

		// creating the String object to get the text fromTextArea   
		String text = area.getText();

		// splitting the String into words  
		String words[] = text.split("\\s");

		// setting the label text to print the number of words and characters of given string  
		l.setText("Words: " + words.length + " Characters:" + text.length());
	}

	// main method
	public static void main(String[] args) {
		new KeyAdapterExample();
	}
}
