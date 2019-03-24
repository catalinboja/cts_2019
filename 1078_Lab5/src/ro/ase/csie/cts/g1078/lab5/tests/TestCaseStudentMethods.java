package ro.ase.csie.cts.g1078.lab5.tests;

import java.util.ArrayList;

import junit.framework.TestCase;
import ro.ase.csie.cts.g1078.lab5.Student;
import ro.ase.csie.cts.g1078.lab5.exceptions.MathException;

public class TestCaseStudentMethods extends TestCase {

	
	Student student;
	
	public TestCaseStudentMethods(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		student = new Student();
	}
	
	public void testGetMinGradeOrderedAscending() throws MathException {
		ArrayList<Integer> grades = new ArrayList<>();
		int[] values = new int[] {5,6,8,10,10,10};
		for(int grade : values)
			grades.add(grade);
		
		student.setGrades(grades);
		int expectedMin = 5;
		int actualMin = student.getMinGrade();
		
		assertEquals(expectedMin, actualMin);
		
	}
	
	public void testDummy() {
		fail("Ha ha ha");
	}

}
