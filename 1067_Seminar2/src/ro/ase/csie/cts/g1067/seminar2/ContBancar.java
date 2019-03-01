package ro.ase.csie.cts.g1067.seminar2;

public abstract class ContBancar extends Cont{
	double balanta;
	String id;
	
	@Override
	public double getBalanta() {
		return this.balanta;
	}
	
	public ContBancar(String iban) {
		this.id = iban;
	}
}