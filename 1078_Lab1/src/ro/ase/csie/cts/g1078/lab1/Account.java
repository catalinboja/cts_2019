package ro.ase.csie.cts.g1078.lab1;

public abstract class Account {
	public abstract void deposit(Object value);
	public abstract void withdraw(Object value);
	public abstract void transfer(Object value, Account destination);
	public abstract double getBalance();
	
}
