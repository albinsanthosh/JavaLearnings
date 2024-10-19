package io;

import java.io.Console;

//Java program to demonstrate working of System.console()
//Note that this program does not work on IDEs as
//System.console() may require console
class ConsoleExample {
	public static void main(String args[]) {
		Console c = System.console();
		System.out.println("Enter your name: ");
		String n = c.readLine();	
		System.out.println("Welcome " + n);
	}
}