package ro.ase.csie.cts.g1067.seminar6.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1067.seminar6.Student;
import ro.ase.csie.cts.g1067.seminar6.exceptii.ExceptieMatematica;

public class TestCaseStudentPerformance {

	Student student;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student();
		
		int nrNote = (int)5E7;
		//50000 = 5E4
		int[] note = new int[nrNote];
		for(int i = 0;i<nrNote;i++)
			note[i] = nrNote - i;
		student.setNote(note);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 50)
	public void testGetNotaMinimaPerformance2() throws ExceptieMatematica{
		student.getNotaMinima();

	}

}
