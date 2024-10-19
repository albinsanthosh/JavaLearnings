package io;

import java.io.*;

public class ByteArrayOutputStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("C:\\Users\\AS00776261\\Desktop\\testin.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\AS00776261\\Desktop\\testout.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();// has no effect
		System.out.println("Success...");
	}
}