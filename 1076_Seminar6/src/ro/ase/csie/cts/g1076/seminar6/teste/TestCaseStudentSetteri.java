package ro.ase.csie.cts.g1076.seminar6.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1076.seminar6.Student;
import ro.ase.csie.cts.g1076.seminar6.exceptii.ExceptieStudent;

public class TestCaseStudentSetteri {
	
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Pregatire unit teste - Student");
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Sfarsit unit teste - Student");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Creare student");
		student = new Student();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Stergere student");
	}

	@Test
	public void testSetNoteReferintaExterna() throws ExceptieStudent {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(9);
		note.add(10);
		
		student.setNote(note);
		
		int primaNota = student.getNote().get(0);
		int notaModificata =  5;
		note.set(0, notaModificata);
		
		assertEquals(primaNota, (int)student.getNote().get(0));
		
	}
	
	@Test(expected = ExceptieStudent.class)
	public void testSetNoteReferintaNull() throws ExceptieStudent {
		student.setNote(null);
	}
}
