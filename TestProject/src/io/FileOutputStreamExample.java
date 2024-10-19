package io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {

		FileOutputStream fout;
		try {
			fout = new FileOutputStream("C:\\Users\\AS00776261\\Desktop\\testout.txt");
			fout.write(65);
			
			String s="Welcome to javaTpoint.";    
            byte b[]=s.getBytes();//converting string into byte array 
            fout.write(b);
            
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
