package ro.ase.csie.cts.g1067.seminar4.teste;

import junit.framework.TestCase;

public class TestCaseProba extends TestCase {

	public TestCaseProba(String name) {
		super(name);
	}
	
	public void testCeva() {
		System.out.println("Nimic");
	}
	
	public void testFailure() {
		fail("Ha ha");
	}

}
