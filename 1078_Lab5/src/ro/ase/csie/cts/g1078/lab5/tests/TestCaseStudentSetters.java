package ro.ase.csie.cts.g1078.lab5.tests;

import java.util.Random;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1078.lab5.Student;
import ro.ase.csie.cts.g1078.lab5.exceptions.StudentException;

public class TestCaseStudentSetters extends TestCase {

	//Test fixture
	Student student;
	
	public TestCaseStudentSetters(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("The TestCase setup");
		student = new Student();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetAgeNormalValues() throws StudentException {
		Random random = new Random();
		int normalAge = 
				random.nextInt(Student.MAX_AGE - Student.MIN_AGE) +
				Student.MIN_AGE;
	
		student.setAge(normalAge);
		
		int actualAge = student.getAge();
		assertEquals(normalAge, actualAge);
		
	}
	
	public void testSetAgeLowerLimit() {
		try {
			student.setAge(Student.MIN_AGE);
			int actualAge = student.getAge();
			assertEquals(Student.MIN_AGE, actualAge);
		} catch (StudentException e) {
			fail("We got an exception. It's not ok.");
		}
	}
	
	public void testSetAgeUpperLimit() {
		try {
			student.setAge(Student.MAX_AGE);
			int actualAge = student.getAge();
			assertEquals(Student.MAX_AGE, actualAge);
		} catch (StudentException e) {
			fail("We got an exception. It's not ok.");
		}
	}
	
	public void testSetAgeLeftToLowerLimit() {
		try {
			student.setAge(Student.MIN_AGE - 1);
			fail("We don't get an exception");
		} catch (StudentException e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Another exception type received");
		}
	}

}
