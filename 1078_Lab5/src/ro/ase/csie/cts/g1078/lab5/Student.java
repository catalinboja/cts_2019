package ro.ase.csie.cts.g1078.lab5;

import java.util.ArrayList;

import ro.ase.csie.cts.g1078.lab5.exceptions.MathException;
import ro.ase.csie.cts.g1078.lab5.exceptions.StudentException;

public class Student {
	ArrayList<Integer> grades;
	String name;
	int age;
	
	public static final int MIN_AGE = 14;
	public static final int MAX_AGE = 90;
	
	public Student(ArrayList<Integer> grades, String name, int age) {
		this.grades = grades;
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		this.grades = new ArrayList<>();
		this.name = "John Doe";
		this.age = 0;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws StudentException{
		if(age < Student.MIN_AGE)
			throw new StudentException();
		this.age = age;
	}
	
	public int getMinGrade() throws MathException{
		int minimum = this.grades.get(0);
		for(int grade : this.grades)
			if(minimum > grade)
				minimum = grade;
		return minimum;
	}
	

}
