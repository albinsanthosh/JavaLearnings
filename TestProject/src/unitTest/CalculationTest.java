package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import testPackage.Calculation;

public class CalculationTest {
	
//	junit4.jar and hamcrest-core.jar files
//	void assertEquals(boolean expected,boolean actual): checks that two primitives/objects are equal. It is overloaded.
//	void assertTrue(boolean condition): checks that a condition is true.
//	void assertFalse(boolean condition): checks that a condition is false.
//	void assertNull(Object obj): checks that object is null.
//	void assertNotNull(Object obj): checks that object is not null.

//	@Test  
//	public void testFindMax(){  
//	  assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
//	  assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
//	}  
		
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		 
//	}
	
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));  
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Calculation.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan"));  
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  

}
