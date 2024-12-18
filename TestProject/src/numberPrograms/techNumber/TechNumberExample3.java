package numberPrograms.techNumber;
import java.util.*;

public class TechNumberExample3{

	public static void main(String args[]){
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		
		//reads an integer from the user
		int n=sc.nextInt();
		
		//loop counts the number of digits of the given number
		while(n>0){
			count++;
			n=n/10;
		}
		
		//check if the given number has even number of digits or not
		if(count%2==0)
			System.out.println("The given number is a tech number.");
		else
			System.out.print("The given number is not a tech number.");
	}
}