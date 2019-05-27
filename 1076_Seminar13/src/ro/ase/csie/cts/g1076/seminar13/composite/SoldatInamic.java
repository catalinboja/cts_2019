package ro.ase.csie.cts.g1076.seminar13.composite;

public class SoldatInamic extends NodArmataAbstract{

	String nume;
	String arma;
	boolean esteComandant;
	
	public SoldatInamic(String nume, String arma, boolean esteComandant) {
		super();
		this.nume = nume;
		this.arma = arma;
		this.esteComandant = esteComandant;
	}

	@Override
	public void ataca(String nume) {
		System.out.println(this.nume + " il ataca pe " + nume);
	}

	@Override
	public void seApara() {
		System.out.println(this.nume + " se apara ");
	}

	@Override
	public void getInfo() {
		System.out.println(this.nume + " - " + this.arma);
		if(this.esteComandant)
			System.out.println("Este comandant nivel");
	}

	@Override
	public void adaugaElement(NodArmataAbstract nodCopil) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeElement(NodArmataAbstract nodCopil) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodArmataAbstract getElement(int index) {
		throw new UnsupportedOperationException();
	}
	
	
	
	
}
