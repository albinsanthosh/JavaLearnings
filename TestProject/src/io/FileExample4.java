package io;

import java.io.File;

public class FileExample4 {
	public static void main(String[] args) {  
	    File dir=new File("C:\\Users\\AS00776261\\Desktop");  
	    File files[]=dir.listFiles();  
	    for(File file:files){  
	        System.out.println(file.getName()+" Can Write: "+file.canWrite()
	        +" Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");  
	    }  
	}
}
