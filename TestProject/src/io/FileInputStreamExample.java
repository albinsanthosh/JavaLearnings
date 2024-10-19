package io;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\AS00776261\\Desktop\\testout.txt");
			 int i=0;  
			 
			// read single character
			i = fin.read();
			System.out.println((char) i);

			// read all characters
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
