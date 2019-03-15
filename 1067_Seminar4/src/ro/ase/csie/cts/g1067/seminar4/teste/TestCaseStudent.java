package ro.ase.csie.cts.g1067.seminar4.teste;

import java.util.ArrayList;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1067.seminar4.Student;
import ro.ase.csie.cts.g1067.seminar4.exceptii.ExceptieStudent;

public class TestCaseStudent extends TestCase {
	
	//Test Fixture
	Student stud;

	public TestCaseStudent(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Incepe un unit test");
		
		stud = new Student("Gigel", null);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("S-a terminat un unit test");
	}

	public void testCalculMedieValoriNormale() throws ExceptieStudent{
		ArrayList<Integer> note = new ArrayList<>();
		note.add(10);
		note.add(9);
		Student stud = new Student("Gigel", note);
		
		float valoareAsteptata = 9.5f;
		float valoareCalculata = stud.calculMedie();
		
		assertEquals("Probleme la calcularea mediei",valoareAsteptata, valoareCalculata,0.001f);
	}
	
	public void testCalculMedieFaraNote() {
		try {
			stud.calculMedie();
			fail();
		} catch (ExceptieStudent e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("A crapat dar cu alta exceptie");
		}
	}
}
