package ro.ase.csie.cts.g1078.lab2;

import ro.ase.csie.cts.g1078.lab2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1078.lab2.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

	public final static double MAX_CREDIT = 5000;
	
	public CurrentAccount(String iban) {
		super(iban);
		this.balance = MAX_CREDIT;
	}

	@Override
	public void deposit(Object value) throws UnsupportedOperationException, IllegalTransferException {
		double receivedValue = 0;
		if(value instanceof Double)
			receivedValue = (Double)value;
		else
			throw new UnsupportedOperationException("Wrong type");
		if(receivedValue <= 0)
			throw new IllegalTransferException();
		
		this.balance += receivedValue;
	}

	@Override
	public void withdraw(Object value) throws InsufficientFundsException {
		double input = Utility.getValueFromObject(value);
		if(this.balance - input < 0)
			throw new InsufficientFundsException();
		this.balance-=input;
		
	}

	@Override
	public void transfer(Object value, Account destination) throws IllegalTransferException, InsufficientFundsException {
		if(this == destination)
			throw new IllegalTransferException();
		
		this.withdraw(value);
		destination.deposit(value);
		
	}
	
}
