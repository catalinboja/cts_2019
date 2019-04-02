package ro.ase.csie.cts.g1067.seminar6.teste;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1067.seminar6.Student;
import ro.ase.csie.cts.g1067.seminar6.exceptii.ExceptieMatematica;
import ro.ase.csie.cts.g1067.seminar6.exceptii.ExceptieStudent;

public class TestCaseStudent {
	
	Student student;
	static int[] note;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Start Test case");
		
		int nrNote = (int)5E7;
		//50000 = 5E4
		note = new int[nrNote];
		for(int i = 0;i<nrNote;i++)
			note[i] = nrNote - i;
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Sfarsit test case");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Start unit test");
		student = new Student();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Unit test finalizat");
	}

	@Test(expected = ExceptieStudent.class)
	public void testSetVarstaLimitaSuperioara() throws ExceptieStudent {
		int depasireLimitaSuperioara = Student.MAX_VARSTA+1;
		student.setVarsta(depasireLimitaSuperioara);
	}
	
	@Test(expected = ExceptieMatematica.class)
	public void testGetNotaMinimaCardinalitateZero() throws ExceptieMatematica {
		int[] note = new int[] {};
		student.setNote(note);
		
		student.getNotaMinima();	
	}
	
	@Test
	public void testGetNotaMinimaCardinalitateUnu() throws ExceptieMatematica {
		int[] note = new int[] {9};
		student.setNote(note);
		
		int minimAsteptat = note[0];
		int minimCalculat = student.getNotaMinima();
		
		assertEquals(minimAsteptat, minimCalculat);
	}
	
	@Test
	public void testGetNotaMinimaPerformance() throws ExceptieMatematica {
		int nrNote = (int)5E7;
		//50000 = 5E4
		int[] note = new int[nrNote];
		for(int i = 0;i<nrNote;i++)
			note[i] = nrNote - i;
		student.setNote(note);
		
		long startTest = System.currentTimeMillis();
		student.getNotaMinima();
		long finalTest = System.currentTimeMillis();
		
		long diferenta = finalTest - startTest;
	
		
		if(diferenta < 50)
			assertTrue(true);
		else
			fail("Depasire limita performanta! " + diferenta);
	}
	
	@Test(timeout = 200)
	public void testGetNotaMinimaPerformance2() throws ExceptieMatematica{

		student.setNote(TestCaseStudent.note);
		student.getNotaMinima();

	}
	
	@Test
	public void testGetNotaMinimaCrossCheck() throws ExceptieMatematica {
		int nrNote = 50;
		int[] noteRandom = new int[nrNote];
		Random random = new Random();
		ArrayList<Integer> listaNote = new ArrayList<>();
		
		for(int i = 0;i<nrNote;i++) {
			noteRandom[i] = random.nextInt(11);
			listaNote.add(noteRandom[i]);
		}
		
		student.setNote(noteRandom);
		
		int notaMinimaLista = Collections.min(listaNote);
		int notaMinimaStudent = student.getNotaMinima();
		
		assertEquals(notaMinimaLista, notaMinimaStudent);
		
	}
	
	@Test
	public void testSetNoteInverseRelationship() {
		student = new Student();
		int[] note = new int[] {5,6,8,9};
		
		student.setNote(note);
		
		assertNotNull(student.getNote());
		
	}
	
	


}
