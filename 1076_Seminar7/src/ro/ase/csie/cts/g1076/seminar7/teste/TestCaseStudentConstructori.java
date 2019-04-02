package ro.ase.csie.cts.g1076.seminar7.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1076.seminar7.Student;

public class TestCaseStudentConstructori {

	Student student;
	
	@Before
	public void setUp() throws Exception {
		student = new Student();
	}

	@Category(ClasaTesteImportante.class)
	@Test
	public void testConstructorInverse(){
		String nume = "Gigel";
		int varsta  = 23;
		ArrayList<Integer> note = 
				new ArrayList<>();
		
		student = new Student(note, nume, varsta);
		
		assertNotNull(student.getNote());
		assertNotEquals("Anonim", student.getNume());
		assertNotEquals(0, student.getVarsta());
	}

}
