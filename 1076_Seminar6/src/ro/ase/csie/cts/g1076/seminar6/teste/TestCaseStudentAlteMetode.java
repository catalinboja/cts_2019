package ro.ase.csie.cts.g1076.seminar6.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1076.seminar6.Student;
import ro.ase.csie.cts.g1076.seminar6.exceptii.ExceptieOperatieMatematica;
import ro.ase.csie.cts.g1076.seminar6.exceptii.ExceptieStudent;

public class TestCaseStudentAlteMetode {
	
	Student student;
	static ArrayList<Integer> note;
	
	@Before
	public void setUp() throws Exception {
		student = new Student();
	}
	
	@BeforeClass
	public static void globalSetUp() {
		note = new ArrayList<>();
		Random random = new Random();
		int nrMaximNote = 5000000;
		
		for(int i=0;i<nrMaximNote;i++)
			note.add(random.nextInt(11));
	}
	
	@Test(expected = ExceptieOperatieMatematica.class)
	public void testNotaMinimaCardinalitateZero() throws ExceptieStudent, ExceptieOperatieMatematica {
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		int notaMinima = student.getNotaMinima();
	}
	
	@Test
	public void testNotaMinimaCardinalitateUnu() throws ExceptieStudent, ExceptieOperatieMatematica {
		ArrayList<Integer> note = new ArrayList<>();
		int nota = 9;
		note.add(nota);
		student.setNote(note);
		
		int notaMinima = student.getNotaMinima();
		
		assertEquals(nota, notaMinima);
	}
	
	@Test
	public void testNotaMinimaPerformanta() throws ExceptieStudent, ExceptieOperatieMatematica {
		ArrayList<Integer> note = new ArrayList<>();
		Random random = new Random();
		int nrMaximNote = 5000000;
		
		for(int i=0;i<nrMaximNote;i++)
			note.add(random.nextInt(11));
		
		student.setNote(note);
		
		long start = System.currentTimeMillis();
		student.getNotaMinima();
		long sfarsit = System.currentTimeMillis();
		
		long durata = sfarsit - start;
		
		if(durata <= 20)
			assertTrue(true);
		else
			fail("Depasire limita performanta: "+durata);
		
	}
	
	@Test(timeout = 20)
	public void testNotaMinimaPerformanta2() throws ExceptieStudent, ExceptieOperatieMatematica {	
		student.setNote(note);	
		student.getNotaMinima();	
	}
}
