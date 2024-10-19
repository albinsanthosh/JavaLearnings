package strings;
import java.util.*;  
  
public class TestSubstringSplit 
{    
    /* Driver Code */  
    public static void main(String args[])  
    {    
        String text=new String("Hello, My name is Sachin");
		/*Splits the sentence by the delimiter passed as an argument*/
		String[] sentences=text.split("\\.");
		System.out.println(Arrays.toString(sentences));
			
    }  
}  