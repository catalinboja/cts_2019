package ro.ase.csie.cts.g1078.lab7.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1078.lab7.Student;
import ro.ase.csie.cts.g1078.lab7.exceptions.ExamException;
import ro.ase.csie.cts.g1078.lab7.mock.ExamMock;

public class TestCaseStudentExams {

	Student student;
	
	@Before
	public void setUp() throws Exception {
		
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(9);
		grades.add(10);
		student = new Student(grades,"John",23);	
	}

	@Category(ImportantTests.class)
	@Test
	public void testAddNewGradeRight() throws ExamException {
		
		int existingNoGrades = student.getGrades().size();
		ExamMock mockExam = new ExamMock();
		mockExam.setReturnedGrade(9);
		
		student.addNewGrade("OOP", mockExam);
		
		assertEquals(existingNoGrades+1, student.getGrades().size());

	}
	
	@Test(expected = ExamException.class)
	public void testAddNewGradeException() throws ExamException {
		
		ExamMock mockExam = new ExamMock();		
		mockExam.setReturnedGrade(-1);
		student.addNewGrade("OOP", mockExam);

	}

}
