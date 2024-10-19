package multiThreading;

public class JavaRuntime {
	public static void main(String args[]) throws Exception {
		// will open a new notepad
		// Runtime.getRuntime().exec("notepad");

		// shutdown system in Java
		// Runtime.getRuntime().exec("shutdown -s -t 0");
		// Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0"); //
		// Windows

		// restart system in Java
		// Runtime.getRuntime().exec("shutdown -r -t 0");

		System.out.println(Runtime.getRuntime().availableProcessors());

		// MemoryTest
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());

		for (int i = 0; i < 100000; i++) {
			new JavaRuntime();
		}
		System.out.println("After creating 100000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());

	}
}