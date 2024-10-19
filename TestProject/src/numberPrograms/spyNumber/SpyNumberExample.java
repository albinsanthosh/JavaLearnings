package numberPrograms.spyNumber;

import java.util.Scanner;

public class SpyNumberExample {

	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		int sum=0, product=1;
		int last;
		
		while(num>0) {
			last=num%10;
			sum=sum+last;
			product=product*last;
			num=num/10;
		}
		
		if(sum==product) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not a spy number");
		}
	}
}
