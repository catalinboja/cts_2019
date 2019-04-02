package ro.ase.csie.cts.g1076.seminar7.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1076.seminar7.Student;
import ro.ase.csie.cts.g1076.seminar7.exceptii.ExceptieOperatieMatematica;
import ro.ase.csie.cts.g1076.seminar7.exceptii.ExceptieSalvareBD;
import ro.ase.csie.cts.g1076.seminar7.teste.mock.MockInterfataBD;

public class TestCaseStudentMetode {

	Student student;
	
	@Before
	public void setUp() throws Exception {
		student = new Student();
	}

	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdunaCross(){
		int parametruA = 2;
		int parametruB = 3;
		int rezAsteptat = parametruA + parametruB;
		
		int rezObtinut = 
				student.adunaNumere(
						parametruA, parametruB);
		
		assertEquals(rezAsteptat, rezObtinut);
	}
	
	@Test
	public void testGetNotaMinimaCross() throws ExceptieOperatieMatematica{
		int nrNote = 10;
		ArrayList<Integer> listaNote = 
				new ArrayList<>();
		
		Random random = new Random();
		for(int i=0;i<nrNote;i++)
		{
			listaNote.add(random.nextInt(11));
		}
		
		student.setNote(listaNote);
		
		int minAsteptat = 
				Collections.min(listaNote);
		int minObtinut = student.getNotaMinima();
		
		assertEquals(minAsteptat, minObtinut);
	}
	
	@Test
	public void testSalvareBDRight() throws ExceptieSalvareBD{
		String nume = "Gigel";
		int varsta  = 23;
		ArrayList<Integer> note = 
				new ArrayList<>();
		
		student = new Student(note, nume, varsta);
		
		MockInterfataBD conexiuneBD = 
				new MockInterfataBD();
		conexiuneBD.setExpectedResult(true);
		
		int rezultat = 
				student.salvareBazaDeDate(
						conexiuneBD);
		
		assertEquals(1, rezultat);
		
	}
	
	@Test(expected = ExceptieSalvareBD.class)
	public void testSalvareBDExceptie() throws ExceptieSalvareBD{
		
		student.setNote(null);
		
		MockInterfataBD conexiuneBD = 
				new MockInterfataBD();
		conexiuneBD.setExpectedResult(false);
		
		student.salvareBazaDeDate(
				conexiuneBD);
	}

}
