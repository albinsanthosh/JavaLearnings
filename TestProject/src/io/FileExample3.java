package io;

import java.io.File;

public class FileExample3 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\AS00776261\\Desktop");
		String filenames[] = f.list();
		for (String filename : filenames) {
			System.out.println(filename);
		}
	}
}
