package ro.ase.csie.cts.curs6.teste;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import junit.framework.TestCase;
import ro.ase.csie.cts.curs6.clase.ColectieDate;
import ro.ase.csie.cts.curs6.exceptii.ExceptieConstructor;
import ro.ase.csie.cts.curs6.exceptii.ExceptieMatematica;
import ro.ase.csie.cts.curs6.exceptii.ExceptieSortare;

public class TestCaseColectie extends TestCase {

	//test fixture
	ColectieDate colectie;
	
	public TestCaseColectie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		colectie = new ColectieDate();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMedieRight() throws ExceptieMatematica {
		int[] valori = new int[] {1,1,2};
		colectie.setValues(valori);
		
		float medieAsteptata = 1.33f;
		float medieCalculata = colectie.medie();
		
		assertEquals(medieAsteptata, medieCalculata, 0.01);
	}
	
	public void testConstructorConformance() throws ExceptieConstructor {
		int[] valori = new int[] {1,1,2};
		colectie = new ColectieDate(valori);
		
		//assertNotNull(colectie);
		assertArrayEquals(valori, colectie.getValues());
	}
	
	public void testSortareOrdering() throws ExceptieSortare {
		int[] valori = new int[] {3,2,1};
		colectie.setValues(valori);
		
		int[] valoriSortate = new int[] {1,2,3};
		
		colectie.sortare();
		
		assertArrayEquals(valoriSortate, colectie.getValues());
	}
	
	public void testMedieRangeToateZero() throws ExceptieMatematica {
		int[] valori = new int[] {0,0,0};
		colectie.setValues(valori);
		
		float medieAsteptata = 0.0f;
		float medieCalculata = colectie.medie();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
	}
	
	public void testMedieRangeMaxValue() {
		int[] valori = new int[] {Integer.MAX_VALUE,3,6};
		colectie.setValues(valori);
		
		try {
			float medieCalculata = colectie.medie();
			fail("Lipsa exceptie");
		} catch (ExceptieMatematica e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Alta exceptie");
		}

	}
	
	public void testSetValoriReference() {
		int[] valori = new int[] {3,2,1};
		colectie.setValues(valori);
		
		int[] valoriInitiale = valori.clone();
		
		valori[1] = 99;
		
		assertArrayEquals(valoriInitiale, colectie.getValues());
	}
	
	public void testConstructorReferintaNullExistence() {
		int[] valori = null;
		try {
			colectie = new ColectieDate(valori);
			fail("Lipsa exceptie");
		} catch (ExceptieConstructor e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Alta exceptie");
		}
	}	
		
		
	public void testSortareCardinalitateZero() {
		int[] valori = new int[] {};
		colectie.setValues(valori);
		
		try {
			colectie.sortare();
			fail("Lipsa exceptie");
		} catch (ExceptieSortare e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Alta exceptie");
		}
	}	
	
	public void testSortareCardinalitateUnu() {
		int[] valori = new int[] {5};
		colectie.setValues(valori);
		
		try {
			colectie.sortare();
			fail("Lipsa exceptie");
		} catch (ExceptieSortare e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Alta exceptie");
		}
	}	
	
	
	public void testSortarePerformanta() throws ExceptieSortare {
		int nrValori = (int)1E5;
		int[] valori = new int[nrValori];
		for(int i = 0;i<nrValori;i++)
			valori[i] = nrValori - i;
		
		colectie.setValues(valori);
		
		long start = System.currentTimeMillis();
		
		colectie.sortare();
		
		long sfarsit = System.currentTimeMillis();
		
		long durata = sfarsit - start;
		
		if(durata < 7000)
			assertTrue(true);
		else
			fail("Prea lent !");
	}	
	
	public void testSortareCrossCheck() throws ExceptieSortare {
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		int nrValori = (int)1E3;
		int[] valori = new int[nrValori];
		Random random = new Random();
		for(int i = 0;i<nrValori;i++) {
			valori[i] = random.nextInt(nrValori);
			lista.add(valori[i]);
		}
		
		
		//cross check
		Collections.sort(lista);
		colectie.setValues(valori);
		colectie.sortare();
		
		int[] valoriSortate = new int[nrValori];
		for(int i = 0;i<nrValori;i++) {
			valoriSortate[i] = lista.get(i);
		}
		
		assertArrayEquals(valoriSortate, colectie.getValues());
		
	}
	
	public void testConstructorInverse() throws ExceptieConstructor {
		int[] valori = new int[] {1,2,3};
		colectie = new ColectieDate(valori);
		
		assertNotNull(colectie);
	}
	
	
}
