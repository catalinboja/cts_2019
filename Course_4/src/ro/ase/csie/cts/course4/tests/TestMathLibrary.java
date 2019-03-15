package ro.ase.csie.cts.course4.tests;

import junit.framework.TestCase;
import ro.ase.csie.cts.course4.MathLibrary;
import ro.ase.csie.cts.course4.exceptions.NegativeInputException;

public class TestMathLibrary extends TestCase {
	public void testAddPositiveValues() throws NegativeInputException {
		int result = 5;
		assertEquals(result, MathLibrary.addPositiveValues(2,3));
	}
	
	public void testAddPositiveValuesWithNegativeInput() {
		 try {
			MathLibrary.addPositiveValues(-2,3);
			fail();
			
		} catch (NegativeInputException e) {
			assertTrue(true);
		}
	}
}
