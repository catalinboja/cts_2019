package ro.ase.csie.cts.g1076.seminar5.teste;

import junit.framework.TestSuite;

public class ColectieTeste extends TestSuite {

	public ColectieTeste(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
	}
	
	public static TestSuite suite() {
		TestSuite suita = new TestSuite();
		suita.addTestSuite(TestCaseSetteriStudent.class);
		suita.addTest(new TestCaseMetodeStudent("testNotaMinimaNull"));
		return suita;
	}

}
