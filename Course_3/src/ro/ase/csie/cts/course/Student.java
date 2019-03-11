package ro.ase.csie.cts.course;

public class Student {
	
	public AccountingInterface accounting;
	public OOPCourseInterface oop;
	ITDepartmentInterface itDep;
	
	void payTuition(){ accounting.payTuition(); }
	void takeOOPExam(){ oop.takeOOPExam(); }
	void saveToDB(){ itDep.saveToDB();}

}
