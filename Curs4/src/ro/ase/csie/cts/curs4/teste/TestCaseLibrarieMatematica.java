package ro.ase.csie.cts.curs4.teste;

import junit.framework.TestCase;
import ro.ase.csie.cts.curs4.LibrarieMatematica;
import ro.ase.csie.cts.curs4.exceptii.ExceptieInputNegativ;

public class TestCaseLibrarieMatematica extends TestCase {
	public void testAdunaNumerePozitive() throws ExceptieInputNegativ {
		int a = 2;
		int b = 3;
		int rezultat = a + b;
		assertEquals(rezultat, 
				LibrarieMatematica.adunaNumerePozitive(a, b));
	}
	
	public void testAdunaNumerePozitiveExceptie() {
		try {
			
			LibrarieMatematica.adunaNumerePozitive(-2, 5);
			fail();
			
		} catch (ExceptieInputNegativ e) {
			assertTrue(true);
		}
	}
	
	public void testAdunaNumerePozitiveExceptieInput2() {
		try {
			
			LibrarieMatematica.adunaNumerePozitive(3, -4);
			fail();
			
		} catch (ExceptieInputNegativ e) {
			assertTrue(true);
		}
	}
}
