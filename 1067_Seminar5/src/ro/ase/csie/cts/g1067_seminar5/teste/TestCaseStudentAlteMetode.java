package ro.ase.csie.cts.g1067_seminar5.teste;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1067_seminar5.Student;
import ro.ase.csie.cts.g1067_seminar5.exceptii.ExceptieMatematica;

public class TestCaseStudentAlteMetode extends TestCase {

	Student student;
	
	public TestCaseStudentAlteMetode(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		student = new Student();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testNotaMinimaValoriNormale() throws ExceptieMatematica {
		int[] note = new int[] {5,8,3,10,10,9};
		student.setNote(note);
		
		int minimAsteptat = 3;
		int minimObtinut = student.getNotaMinima();
		
		assertEquals(minimAsteptat, minimObtinut);
	}
	
	public void testNotaMinimaValoriSortateCrescator() throws ExceptieMatematica {
		int[] note = new int[] {1,2,3,4,5,6,7,8,9};
		
		student.setNote(note);
		int minimAsteptat = 1;
		int minimObtinut = student.getNotaMinima();
		
		assertEquals(minimAsteptat, minimObtinut);
	}
	
	public void testNotaMinimaReferintaNull() {
		student.setNote(null);
		try {
			student.getNotaMinima();
			fail("Nu arunca exceptie");
		} catch (ExceptieMatematica e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Alta exceptie "+e.getClass());
		}
	}

}
