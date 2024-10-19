package testPackage;

public class RemoveEndingZeros {

	// Take i/p num
	// Convert to String proc
	// Check the last char if it is not 0
	// if 0, then remove it
	// else return proc
	public static void main(String args[]) {
		/*
		 * int num = 50000; String proc = Integer.toString(num);
		 * proc=proc.substring(0, cur);
		 */
		String proc = "05090070000";
		int len = proc.length();
		
		System.out.println("Entered num:- " + proc);

		int cur=len-1;
		
		char ch[] = proc.toCharArray();
		int idx=cur;

		while(cur>0) {
			if(ch[cur] == '0') {
				cur--;
				idx=cur;
			}
			else {
				break;
			}
		}
		
		char[] ch2=new char[idx+1];
		for(int i=0; i<=idx; i++) {
			ch2[i]=ch[i];
		}
		System.out.println("Answer:- " + String.valueOf(ch2));
	}

}
