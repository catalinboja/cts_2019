package ro.ase.csie.cts.g1078.lab5.tests;

import junit.framework.TestSuite;

public class ImportantTestsCollection extends TestSuite {

	public ImportantTestsCollection(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		System.out.println("Setup at suite level !");
	}
	

	protected void tearDown() throws Exception {
	}
	
	public static TestSuite suite() {
		TestSuite collection = new TestSuite();
		
		//importing all unit tests
		collection.addTestSuite(TestCaseStudentSetters.class);
		//import only some
		collection.addTest(
				new TestCaseStudentMethods("testGetMinGradeOrderedAscending"));
		
		
		return collection;
	}

}
