package testPackage;

import java.net.URL;
import java.net.URLConnection;

//public class test2 {
//    public static void main(String[] args) {
//        try {
//            //URL url = new URL("https://repo.maven.apache.org/maven2");
//            URL url = new URL("http://www.google.co.in/");
//            URLConnection connection = url.openConnection();
//            connection.connect();
//            System.out.println("Internet is accessible");
//        } catch (Exception e) {
//            System.out.println("No internet access");
//        }
//    }
//}

//Java program for Checking Internet connectivity 
import java.util.*; 
import java.io.*; 

class ConnectionTest { 
 public static void main(String args[]) throws Exception 
 { 
     Process process = java.lang.Runtime.getRuntime().exec("ping localhost"); 
     int x = process.waitFor(); 
     if (x == 0) { 
         System.out.println("Connection Successful, "
                            + "Output was " + x); 
     } 
     else { 
         System.out.println("Internet Not Connected, "
                            + "Output was " + x); 
     } 
 } 
} 