package io;

import java.io.*;
import java.security.PermissionCollection;

public class FilePermissionExample {
	public static void main(String[] args) throws IOException {
		String srg = "C:\\Users\\AS00776261\\Desktop\\check\\test\\IO Package\\testout.txt";
		FilePermission file1 = new FilePermission("C:\\Users\\AS00776261\\Desktop\\check\\test\\IO Package\\-", "read");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);
		FilePermission file2 = new FilePermission(srg, "write");
		permission.add(file2);
		if (permission.implies(new FilePermission(srg, "read,write"))) {
			System.out.println("Read, Write permission is granted for the path " + srg);
		} else {
			System.out.println("No Read, Write permission is granted for the path " + srg);
		}
	}
}
