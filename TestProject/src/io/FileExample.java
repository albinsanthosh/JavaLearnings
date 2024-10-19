package io;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {  
		  
        try {  
            File file = new File("C:\\Users\\AS00776261\\Desktop\\testout1.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}
