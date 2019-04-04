package ro.ase.csie.cts.curs7.mock;

import ro.ase.csie.cts.curs7.interfete.InterfataBazaDeDate;

public class MockBD implements InterfataBazaDeDate {

	private int expectedReturnSalvareDate;
	
	public void setExpectedReturnSalvareDate(int expectedReturnSalvareDate) {
		this.expectedReturnSalvareDate = expectedReturnSalvareDate;
	}

	@Override
	public int salvareDate(int[] valori) {
		return expectedReturnSalvareDate;
	}

}
