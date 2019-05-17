package ro.ase.csie.cts.g1076.seminar12.decorator;

public class SuperErou implements InterfataSuperErou{
	String nume;
	String arma;
	
	public SuperErou(String nume, String arma) {
		this.nume = nume;
		this.arma = arma;
	};
	
	public void alearga() {
		System.out.println(this.nume + " alearga.");
	}
	
	public void ataca(String inamic) {
		System.out.println(this.nume + " il ataca pe " + inamic + 
				" cu " + this.arma);
	}

	@Override
	public String getNume() {
		return this.nume;
	}
	
}
