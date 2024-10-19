package io;

import java.io.Console;

//Java program to demonstrate working of System.console()
//Note that this program does not work on IDEs as
//System.console() may require console
public class ConsolePasswordExample {

	public static void main(String args[]) {
		Console c = System.console();
		System.out.println("Enter password: ");
		char[] ch = c.readPassword();
		String pass = String.valueOf(ch);// converting char array into string
		System.out.println("Password is: " + pass);
	}

}
