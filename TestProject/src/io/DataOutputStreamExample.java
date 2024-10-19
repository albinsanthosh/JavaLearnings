package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("C:\\Users\\AS00776261\\Desktop\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(66);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  	
}
