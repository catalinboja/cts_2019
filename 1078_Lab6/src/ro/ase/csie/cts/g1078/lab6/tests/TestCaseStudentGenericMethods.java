package ro.ase.csie.cts.g1078.lab6.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1078.lab6.Student;
import ro.ase.csie.cts.g1078.lab6.exceptions.MathException;
import ro.ase.csie.cts.g1078.lab6.exceptions.StudentException;

public class TestCaseStudentGenericMethods {

	Student student;
	public static ArrayList<Integer> grades;
	
	@BeforeClass
	public static void globalSetUp() {
		grades = new ArrayList<>();
		int noGrades = 5000000;
		Random random = new Random();
		for(int i = 0;i <noGrades;i++)
			grades.add(random.nextInt(11));
	}
	
	@Before
	public void setUp() throws Exception {
		student = new Student();
		
		
	}

	@Test(expected = MathException.class)
	public void testGetMinGradeErrorCondition() throws MathException {
		//by default, a student does not have any grades
		student.getMinGrade();
	}
	
	@Test(expected = MathException.class)
	public void testGetMinGradeCardinalityZero() throws StudentException, MathException {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		student.getMinGrade();
	}
	
	@Test
	public void testGetMinGradeCardinalityOne() throws StudentException, MathException {
		ArrayList<Integer> grades = new ArrayList<>();
		int singleGrade = 10;
		grades.add(singleGrade);
		
		student.setGrades(grades);
		
		int minGrade = student.getMinGrade();
		
		assertEquals(singleGrade, minGrade);
	}
	
	@Test
	public void testGetMinGradePerformance() throws StudentException, MathException {
		ArrayList<Integer> grades = new ArrayList<>();
		int noGrades = 5000000;
		Random random = new Random();
		for(int i = 0;i <noGrades;i++)
			grades.add(random.nextInt(11));
		
		student.setGrades(grades);
		
		long startTime = System.currentTimeMillis();
		
		student.getMinGrade();
		
		long finishTime = System.currentTimeMillis();
		long duration = finishTime - startTime;
		
		if(duration < 20)
			assertTrue(true);
		else
			fail("It took too long ! "+ duration);
	}
	
	@Test(timeout = 20)
	public void testGetMinGradePerformance2() throws StudentException, MathException {

		student.setGrades(TestCaseStudentGenericMethods.grades);
		student.getMinGrade();
		
	}
	
}
