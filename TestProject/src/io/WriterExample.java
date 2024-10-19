package io;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("C:\\Users\\AS00776261\\Desktop\\testout.txt");
			String content = "I love my country";
			w.write(content);
			w.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
