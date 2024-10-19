package numberPrograms.automorphicNumberProgram;
public class AutomorphicNumberExample1{

	//user-defined static method that checks whether the number is automorphic or not
	static boolean isAutomorphic(int num){

	//determines the square of the specified numberx
	int square=num*num;

		//comparing the digits until the number becomes 0
		while(num>0){
			
			//find the remainder(last digit) of the variable num and square and comparing them
			if(num%10 != square%10)
				return false;
			
			//reduce num and square by dividing them by 10
			num=num/10;
			square=square/10;
		}
	return true;
	}
	
	//Driver code
	public static void main(String args[]){
		//number to be checks
		//calling the method and prints the result accordingly
		System.out.println(isAutomorphic(76)?"Automorphic":"Not Automorphic");
		System.out.println(isAutomorphic(13)?"Automorphic":"Not Automorphic");
	}

}