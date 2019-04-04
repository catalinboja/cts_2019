package ro.ase.csie.cts.curs7.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.curs7.clase.ColectieDate;
import ro.ase.csie.cts.curs7.exceptii.ExceptieBD;
import ro.ase.csie.cts.curs7.interfete.InterfataBazaDeDate;
import ro.ase.csie.cts.curs7.mock.MockBD;

public class TestCaseColectie {

	ColectieDate colectie;
	MockBD conexiuneSimulata;
	
	@Before
	public void setUp() throws Exception {
		colectie = new ColectieDate();
		conexiuneSimulata = new MockBD();
	}

	@Test
	public void testSalvareBDRight() throws ExceptieBD {
		int[] valori = new int[] {3,7,4};
		int nrValori = valori.length;
		
		colectie.setValues(valori);
		conexiuneSimulata.setExpectedReturnSalvareDate(valori.length);
		
		int nrValoriSalvate = colectie.salvareBD(conexiuneSimulata);
		
		assertEquals(nrValori,nrValoriSalvate);
	}
	
	@Category(TesteImportante.class)
	@Test(expected = ExceptieBD.class)
	public void testSalvareBDException() throws ExceptieBD {
		int[] valori = new int[] {};
		int nrValori = valori.length;
		
		conexiuneSimulata.setExpectedReturnSalvareDate(-1);
		
		colectie.setValues(valori);	
		colectie.salvareBD(conexiuneSimulata);

	}
	
	@Test(expected = ExceptieBD.class)
	public void testSalvareBDException2() throws ExceptieBD {
		int[] valori = new int[] {};
		int nrValori = valori.length;
		
	
		colectie.salvareBD(new InterfataBazaDeDate() {
			
			@Override
			public int salvareDate(int[] valori) {
				return -1;
			}
		});

	}

}
