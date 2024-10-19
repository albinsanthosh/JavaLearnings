package io;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterExample {
	public static void main(String args[]) throws Exception {
		CharArrayWriter out = new CharArrayWriter();
		out.write("Welcome to javaTpoint");
		FileWriter f1 = new FileWriter("C:\\Users\\AS00776261\\Desktop\\testin.txt");
		FileWriter f2 = new FileWriter("C:\\Users\\AS00776261\\Desktop\\testout.txt");
		FileWriter f3 = new FileWriter("C:\\Users\\AS00776261\\Desktop\\testin2.txt");
		FileWriter f4 = new FileWriter("C:\\Users\\AS00776261\\Desktop\\testout2.txt");
		out.writeTo(f1);
		out.writeTo(f2);
		out.writeTo(f3);
		out.writeTo(f4);
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		System.out.println("Success...");
	}
}