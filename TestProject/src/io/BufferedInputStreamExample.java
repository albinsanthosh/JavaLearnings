package io;

import java.io.*;

public class BufferedInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\AS00776261\\Desktop\\testout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			System.out.println(bin.available());
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}