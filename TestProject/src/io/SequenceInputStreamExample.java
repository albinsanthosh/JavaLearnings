package io;

import java.io.*;

class SequenceInputStreamExample {
	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("C:\\Users\\AS00776261\\Desktop\\testin.txt");
		FileInputStream input2 = new FileInputStream("C:\\Users\\AS00776261\\Desktop\\testout.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}
