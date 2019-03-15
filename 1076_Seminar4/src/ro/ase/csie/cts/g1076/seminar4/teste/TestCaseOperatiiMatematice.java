package ro.ase.csie.cts.g1076.seminar4.teste;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1076.seminar4.OperatiiMatematice;
import ro.ase.csie.cts.g1076.seminar4.exceptii.ExceptieVectorNull;

public class TestCaseOperatiiMatematice extends TestCase {

	
	private OperatiiMatematice opMatematice;
	
	public TestCaseOperatiiMatematice(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		opMatematice = new OperatiiMatematice();
		System.out.println("Mesaj inainte de test");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Mesaj dupa test");
	}
	
	public void testSumaElementeConditiiNormale() throws ExceptieVectorNull {
		opMatematice = new OperatiiMatematice(4);
		int expectedResult = 10;
		int realResult = opMatematice.sumaElemente();
		
		assertEquals("Suma calculata nu este corecta", 
				expectedResult, realResult);
	}
	
	public void testSumaElementeExceptieElementeLipsa() {

		try {
			opMatematice.sumaElemente();
			fail("Lipsa exceptie pentru suma fara elemente !");
		}
		catch(ExceptieVectorNull ex) {
			assertTrue(true);
		}
		catch(Exception ex) {
			fail("Alta exceptie !");
		}
		
		
	}
	
	public void testFail() {
		fail("Test care esueaza!");
	}

}
