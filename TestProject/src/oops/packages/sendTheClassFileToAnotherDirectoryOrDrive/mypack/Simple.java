package oops.packages.sendTheClassFileToAnotherDirectoryOrDrive.mypack;

public class Simple{
	
	public static void main(String args[]){
		System.out.println("Welcome to package");
	}
}

//javac -d "C:\Users\AS00776261\Desktop\Learning\Java\Pgms\Others\Packages\Send the class file to another directory or drive\classes" Simple.java
//set classpath=C:\Users\AS00776261\Desktop\Learning\Java\Pgms\Others\Packages\Send the class file to another directory or drive\classes;.;
//java mypack.Simple

//switch
//java -classpath "C:\Users\AS00776261\Desktop\Learning\Java\Pgms\Others\Packages\Send the class file to another directory or drive\classes" mypack.Simple