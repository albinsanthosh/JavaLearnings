package io;

import java.io.*;

public class BufferedReaderExampleFromConsole {
	public static void main(String args[]) throws Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Welcome " + name);
	}
}
