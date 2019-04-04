package ro.ase.csie.cts.g1078.lab7.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1078.lab7.Student;
import ro.ase.csie.cts.g1078.lab7.exceptions.MathException;
import ro.ase.csie.cts.g1078.lab7.exceptions.StudentException;

public class TestCaseStudentMethods {
	Student student;
	
	@Before
	public void setUp() throws Exception {
		student = new Student();
	}

	@Test
	public void testGetMinGradeCrossCheck() throws StudentException, MathException {
		Random random = new Random();
		int noGrades = 20;
		ArrayList<Integer> grades = new ArrayList<>();
		for(int i=0;i<noGrades;i++)
			grades.add(random.nextInt(11));
		
		student.setGrades(grades);
		
		int expectedMin = Collections.min(grades);
		int actualMin = student.getMinGrade();
		
		assertEquals(expectedMin, actualMin);
	}
	
	@Test
	public void testAdding2Numbers() {
		int value1 = 10;
		int value2 = 20;
		
		int expectedSum = value1 + value2;
		int actualSum = student.addNumbers(value1, value2);
		
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testAddNumbersInverse() {
		int value1 = 10;
		int value2 = 20;
		
		int actualSum = student.addNumbers(value1, value2);
		
		int difference =  actualSum - value1;
		
		assertEquals(value2, difference);
	}
	
	@Category(ImportantTests.class)
	@Test
	public void testCostructorInverse() {
		String testName = "John";
		int testAge = 23;
		ArrayList<Integer> testGrades = new ArrayList<>();
		student = new Student(testGrades, testName, testAge);
		
		assertNotNull(student.getName());
		assertNotNull(student.getGrades());
		assertNotEquals(0, student.getAge());
	}

}
