package testPackage;

public class CharacterArrayCheck {

	public static void main(String[] arg) {
		
		//[num[0]-'0']: getting the number equal the decimal value 
		// of the character (assuming the char is the digit)
		String[] onedigit = new String[] { "Zero", "One", "Two"};
		char num[]= new char[]{'1', '2', '3'};
		int x=2;
		System.out.println('0');
		System.out.println(num[x]);
		System.out.println(num[x] - '0');
		//System.out.println(onedigit[num[x] - '0']);
		
		System.out.println("----------------");
		char num2[]="1234".toCharArray();
		System.out.println(num2[x]);
		System.out.println(num2[x] - '0');
	}
}
