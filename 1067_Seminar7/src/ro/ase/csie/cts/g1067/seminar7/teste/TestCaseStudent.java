package ro.ase.csie.cts.g1067.seminar7.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1067.seminar7.Student;
import ro.ase.csie.cts.g1067.seminar7.exceptii.ExceptieExamen;
import ro.ase.csie.cts.g1067.seminar7.mock.MockExamen;

public class TestCaseStudent {

	Student student;
	static MockExamen mockExamen;
	
	@BeforeClass
	public static void globalSetUp() {
		mockExamen = new MockExamen();
	}
	
	@Before
	public void setUp() throws Exception {
		student = new Student();
	}

	@Category({
		CategorieTesteImportante.class,
		CategorieTesteNormale.class})
	@Test
	public void testAdaugaNotaExamenRight() throws ExceptieExamen {
		int[]  note = new int[] {9,9,10};
		int nrNote = note.length;
		student.setNote(note);
		
		mockExamen.setExpectedReturnSustineExamen(10);		
		student.adaugaNotaExamen("POO", mockExamen);
		
		assertEquals(nrNote+1, student.getNote().length);
	}
	
	@Category({CategorieTesteNormale.class})
	@Test
	public void testAdaugaNotaExamenAbsent() throws ExceptieExamen {
		int[]  note = new int[] {9,9,10};
		int nrNote = note.length;
		student.setNote(note);
		
		mockExamen.setExpectedReturnSustineExamen(-1);
		student.adaugaNotaExamen("POO", mockExamen);
		
		assertEquals(nrNote, student.getNote().length);
	}
	
	@Category({CategorieTesteNormale.class})
	@Test(expected = ExceptieExamen.class)
	public void testAdaugaNotaExamenExceptie() throws ExceptieExamen {
		
		mockExamen.setExpectedReturnSustineExamen(0);
		student.adaugaNotaExamen("POO", mockExamen);
	}

}
