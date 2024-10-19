package io;

import java.io.*;

public class BufferedWriterExample {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("C:\\Users\\AS00776261\\Desktop\\testout.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Welcome to javaTpoint.");
		buffer.close();
		System.out.println("Success");
	}
}