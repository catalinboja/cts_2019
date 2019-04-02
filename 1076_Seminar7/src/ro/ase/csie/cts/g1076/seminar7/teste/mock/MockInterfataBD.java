package ro.ase.csie.cts.g1076.seminar7.teste.mock;

import ro.ase.csie.cts.g1076.seminar7.Student;
import ro.ase.csie.cts.g1076.seminar7.intefete.externe.InterfataBD;

public class MockInterfataBD implements InterfataBD{

	boolean expectedResult;
	
	public MockInterfataBD(boolean result){
		this.expectedResult = result;
	}
	
	public MockInterfataBD(){
		this.expectedResult = false;
	}
	
	public void setExpectedResult(boolean expectedResult) {
		this.expectedResult = expectedResult;
	}

	@Override
	public boolean salvareBD(Student stud) {
		return this.expectedResult;
	}

}
