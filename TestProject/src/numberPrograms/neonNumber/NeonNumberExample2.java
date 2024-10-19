package numberPrograms.neonNumber;

import java.io.*;

public class NeonNumberExample2{

	//function to check Neon Number
	static boolean isNeon(int num){
		
		//calculate the square of the given number
		int sq=num*num;
		
		//stores the sum of digits
		int sumOfdigits=0;
		
		//executes until the condition becomes false
		while(sq!=0){
			//finds the last digit of the variable sq and adds it to the variable sum
			sumOfdigits=sumOfdigits+sq%10;
			
			//removes the last digit of the varible 
			sq=sq/10;
		}
		//compares the sumOfdigits with num and returns the boolean value accordingly
		return (sumOfdigits==num);
	}
	
	public static void main(String args[]){
		
		System.out.print("Neon Numbers between the given range are: ");
		
		//0 is the low limit and 100000 is the upper limit
		for(int i=0; i<=100000; i++)
		
		//calling the user-defined number
		if(isNeon(i))
			
			//prints all the neon numbers between given range
			System.out.print(i+" ");
		
	}
}