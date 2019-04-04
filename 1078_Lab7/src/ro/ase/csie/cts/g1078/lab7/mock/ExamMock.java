package ro.ase.csie.cts.g1078.lab7.mock;

import ro.ase.csie.cts.g1078.lab7.Student;
import ro.ase.csie.cts.g1078.lab7.interfaces.ExamInterface;

public class ExamMock implements ExamInterface{

	public static final int NORMAL_GRADE = 10;
	
	private int returnedGrade;
	
	
	public void setReturnedGrade(int returnedGrade) {
		this.returnedGrade = returnedGrade;
	}


	@Override
	public int takeExam(String courseName, Student student) {
		return returnedGrade;
	}

}
