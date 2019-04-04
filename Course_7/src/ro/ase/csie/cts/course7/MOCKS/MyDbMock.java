package ro.ase.csie.cts.course7.MOCKS;

import ro.ase.csie.cts.course7.interfaces.DBInterface;

public class MyDbMock implements DBInterface{
	
	private boolean expectedReturnValue;
	
	

	public void setExpectedReturnValue(boolean expectedReturnValue) {
		this.expectedReturnValue = expectedReturnValue;
	}

	@Override
	public boolean saveDB(int[] values) {
		return expectedReturnValue;
	}

}
