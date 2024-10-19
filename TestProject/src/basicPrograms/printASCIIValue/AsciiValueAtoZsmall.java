package basicPrograms.printASCIIValue;

public class AsciiValueAtoZsmall {
	public static void main(String[] args) {
		for (int i = 97; i <= 122; i++) {
			System.out.println(" The ASCII value of " + (char) i + " = " + i);
		}
	}
}