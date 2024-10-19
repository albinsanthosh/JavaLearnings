package io;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\AS00776261\\Desktop\\testout.txt");
			fw.write("Welcome to javaTpoint.");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}
}