package ro.ase.csie.cts.g1076.seminar2;

public abstract class ContBancar extends Cont {
	protected double balanta;
	protected String id;
	
	//supradefinire metoda getBalanta
	public double getBalanta() {
		return this.balanta;
	}
	
	public ContBancar(String iban) {
		this.id = iban;
	}
}
