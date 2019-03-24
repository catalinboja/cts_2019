package ro.ase.csie.cts.g1076.seminar5.teste;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1076.seminar5.Student;
import ro.ase.csie.cts.g1076.seminar5.exceptii.ExceptieOperatieMatematica;

public class TestCaseMetodeStudent extends TestCase {

	Student student;
	
	public TestCaseMetodeStudent(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		student = new Student();
	}
	
	public void testNotaMinimaOrderingCrescator() throws ExceptieOperatieMatematica{
		ArrayList<Integer> note = 
				new ArrayList<>();
		int[] valori = new int[] {5,6,7,8,10,10};
		for(int nota : valori)
			note.add(nota);
		student.setNote(note);
		
		int notaMinima = 5;
		int notaMinimaCalculata = student.getNotaMinima();
		
		assertEquals("Test cu valori sortate crescator",
				notaMinima, notaMinimaCalculata);
	}
	
	public void testNotaMinimaNull() {
		student.setNote(null);
		try {
			student.getNotaMinima();
			fail("Nu arunca exceptie");
		} catch (ExceptieOperatieMatematica e) {
			assertTrue(true);
		}
		catch(Exception ex) {
			fail("Arunca un alt tip de exceptie");
		}
	}

}
