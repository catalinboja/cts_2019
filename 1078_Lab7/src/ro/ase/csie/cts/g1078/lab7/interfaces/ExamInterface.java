package ro.ase.csie.cts.g1078.lab7.interfaces;

import ro.ase.csie.cts.g1078.lab7.Student;

public interface ExamInterface {
	/*
	 * returns -1 for an absent student
	 * return grades from 1 to 10
	 * return 0 for other situations
	 */
	public int takeExam(String courseName, Student student);
}
