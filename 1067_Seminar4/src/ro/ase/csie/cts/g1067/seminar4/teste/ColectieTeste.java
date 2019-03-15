package ro.ase.csie.cts.g1067.seminar4.teste;

import junit.framework.TestSuite;

public class ColectieTeste extends TestSuite {

	public ColectieTeste(String name) {
		super(name);
	}
	
	public static TestSuite suite() {
		TestSuite colectie = new TestSuite();
		colectie.addTestSuite(TestCaseStudent.class);
		colectie.addTest(new TestCaseProba("testFailure"));
		
		return colectie;
	}

}
