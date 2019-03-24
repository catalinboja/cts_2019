package ro.ase.csie.cts.g1067_seminar5.teste;

import junit.framework.TestSuite;

public class ColectieTesteImportante extends TestSuite {

	public ColectieTesteImportante(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
	}

	protected void tearDown() throws Exception {
	}
	
	public static TestSuite suite() {
		
		TestSuite colectie = new TestSuite();
		
		colectie.addTestSuite(TestCaseStudentSetteri.class);
		colectie.addTest(new TestCaseStudentAlteMetode("testNotaMinimaReferintaNull"));
		colectie.addTest(new TestCaseStudentAlteMetode("testNotaMinimaValoriSortateCrescator"));
		
		return colectie;
	}

}
