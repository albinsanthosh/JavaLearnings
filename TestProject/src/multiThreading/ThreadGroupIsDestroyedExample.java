package multiThreading;

//Code illustrating the isDestroyed() method  

//import statement  
import java.lang.*;

class ThreadNew1 extends Thread {	
	//constructor of the class  
	ThreadNew1(String tName, ThreadGroup tgrp) {
		super(tgrp, tName);
		start();
	}

	//overriding the run() method  
	public void run() {

		for (int j = 0; j < 100; j++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("The exception has been encountered" + e);
			}

		}

		System.out.println(Thread.currentThread().getName() + " thread has finished executing");
	}
}

public class ThreadGroupIsDestroyedExample {
	//main method  
	public static void main(String argvs[]) throws SecurityException, InterruptedException {
		//creating the thread group  
		ThreadGroup tg = new ThreadGroup("the parent group");

		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

		ThreadNew1 th1 = new ThreadNew1("the first", tg);
		System.out.println("Starting the first");

		ThreadNew1 th2 = new ThreadNew1("the second", tg);
		System.out.println("Starting the second");

		if (tg.isDestroyed() == true) {
			System.out.println("The group has been destroyed.");
		} else {
			System.out.println("The group has not been destroyed.");
		}

	}
}