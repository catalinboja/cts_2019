package ro.ase.csie.cts.g1078.lab6.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1078.lab6.Student;
import ro.ase.csie.cts.g1078.lab6.exceptions.StudentException;

public class TestCaseStudentOtherMethods {
	
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Running all tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("The end !");
	}

	@Before
	public void setUp() throws Exception {
		student = new Student();
		System.out.println("Let's test it!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Unit test is over!");
	}

	@Test(expected = StudentException.class)
	public void testSetGradesNullReference() throws StudentException {
		student.setGrades(null);
	}
	
	@Test
	public void testSetGradesExternalReference() throws StudentException {
		
		int firstGrade = 9;
		
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(firstGrade);
		grades.add(9);
		grades.add(10);
		
		student.setGrades(grades);
		
		int newFirstGrade = 3;
		grades.set(0, newFirstGrade);
		
		assertEquals(firstGrade, (int)student.getGrades().get(0));
		
	}

}
