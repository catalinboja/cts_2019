package ro.ase.csie.cts.g1067.seminar7.mock;

import ro.ase.csie.cts.g1067.seminar7.Student;
import ro.ase.csie.cts.g1067.seminar7.interfete.InterfataExamen;

public class MockExamen implements InterfataExamen{

	private int expectedReturnSustineExamen;
		
	
	public void setExpectedReturnSustineExamen(int expectedReturnSustineExamen) {
		this.expectedReturnSustineExamen = expectedReturnSustineExamen;
	}

	@Override
	public int sustineExamen(String curs, Student student) {
		return expectedReturnSustineExamen;
	}
}
