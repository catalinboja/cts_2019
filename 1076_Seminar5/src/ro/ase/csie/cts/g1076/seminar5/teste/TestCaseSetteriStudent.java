package ro.ase.csie.cts.g1076.seminar5.teste;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1076.seminar5.Student;
import ro.ase.csie.cts.g1076.seminar5.exceptii.ExceptieStudent;

public class TestCaseSetteriStudent extends TestCase {
	
	//test fixture
	Student student;

	public TestCaseSetteriStudent(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		student = new Student();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetVarsta() {
		int nouaVarsta = 23;
		try {
			
			student.setVarsta(nouaVarsta);
			int varstaStudent = student.getVarsta();
			assertEquals("Test valori normale",nouaVarsta, varstaStudent);
			
		} catch (ExceptieStudent e) {
			fail("Am primit exceptie pentru valori normale");
		}
	}
	
	public void testSetVarstaLimitaInferioara() throws ExceptieStudent {
		int nouaVarsta = Student.VARSTA_MINIMA;
		student.setVarsta(nouaVarsta);
		int varstaStudent = student.getVarsta();
		assertEquals(nouaVarsta, varstaStudent);
	}
	
	public void testSetVarstaLimitaSuperioara() throws ExceptieStudent {
		int nouaVarsta = Student.VARSTA_MAXIMA;
		student.setVarsta(nouaVarsta);
		int varstaStudent = student.getVarsta();
		assertEquals(nouaVarsta, varstaStudent);
	}
	
	public void testSetVarstaExternaLimitaInferioara() {
		int nouaVarsta = Student.VARSTA_MINIMA - 1;
		try {
			student.setVarsta(nouaVarsta);
			fail("Nu am primit exceptie");
		} catch (ExceptieStudent e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Am primit o alta exceptie");
		}
	}

}
