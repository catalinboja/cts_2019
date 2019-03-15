package ro.ase.csie.cts.g1078.lab4.tests;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1078.lab4.MyArray;
import ro.ase.csie.cts.g1078.lab4.exceptions.ExceptionZeroValues;

public class MyArrayTestCase extends TestCase {

	MyArray myArray;
	
	public MyArrayTestCase(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Before each test");
		myArray = new MyArray();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("After each test");
	}
	
	public void testElementsSumNormalConditions() throws ExceptionZeroValues {
		MyArray myArray = new MyArray(4);
		int expectedResult = 10;
		int actualResult = myArray.elementsSum();
		
		assertEquals("The sum is not working in normal conditions", 
				expectedResult, actualResult);
	}
	
	public void testElementsSumEmptyArray() {
		try {
			myArray.elementsSum();
			fail("No exception for zero elements");
		}
		catch(ExceptionZeroValues ex) {
			assertTrue(true);
		}
		catch(Exception ex) {
			fail("No ExceptionZeroValues for zero elements");
		}	
	}

}
