package ro.ase.csie.cts.g1067_seminar5.teste;

import java.util.Random;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1067_seminar5.Student;
import ro.ase.csie.cts.g1067_seminar5.exceptii.ExceptieStudent;

public class TestCaseStudentSetteri extends TestCase {

	//Test fixture
	Student student;
	
	public TestCaseStudentSetteri(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		student = new Student();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetVarstaValoriNormale() throws ExceptieStudent {
		int delta = Student.MAX_VARSTA - Student.MIN_VARSTA;
		Random random = new Random();

		int varstaActualizata = 
				random.nextInt(delta) + Student.MIN_VARSTA;
		student.setVarsta(varstaActualizata);
		int varstaStudent = student.getVarsta();
		
		assertEquals(varstaActualizata, varstaStudent);
	}
	
	private int generatorVarsta() {
		int delta = Student.MAX_VARSTA - Student.MIN_VARSTA;
		Random random = new Random();

		int valoare = 
				random.nextInt(delta) + Student.MIN_VARSTA;
		return valoare;
	}
	
	
	public void testConstructorVarsta() throws ExceptieStudent {
		int varstaNoua = generatorVarsta();
		student = new Student(varstaNoua, "John Doe", null);
		
		int varsta = student.getVarsta();
		assertEquals(varstaNoua, varsta);
	}
	
	public void testSetVarstaInAfaraLimitelor() {
		int varstaNoua = Student.MIN_VARSTA - 3;
		try {
			student.setVarsta(varstaNoua);
			fail("Nu genereaza exceptie");
		} catch (ExceptieStudent e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Am primit un alt tip de exceptie");
		}
	}
	
	public void testSetVarstaLimitaInferiora() throws ExceptieStudent {
		int varstaNoua = Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		
		assertEquals(Student.MIN_VARSTA, student.getVarsta());
	}
	
	public void testSetNoteReference() {
		int[] note = new int[] {9,9,10};
		student.setNote(note);
		int primaNota = note[0];
		note[0] = 5;
		assertEquals("Atentie shallow copy",primaNota, student.getNote()[0]);
	}

}
