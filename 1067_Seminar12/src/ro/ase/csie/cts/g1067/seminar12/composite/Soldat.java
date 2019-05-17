package ro.ase.csie.cts.g1067.seminar12.composite;

public class Soldat extends StructuraInamicaAbstracta{
	boolean esteSef;
	String nume;
	
	public Soldat(boolean esteSef, String nume) {
		super();
		this.esteSef = esteSef;
		this.nume = nume;
	}

	@Override
	public void ataca(String erou) {
		System.out.println(this.nume + " ataca pe " + erou);
	}

	@Override
	public void seApara() {
		System.out.println(this.nume + " se apara");
	}

	@Override
	public void getInfo() {
		if(this.esteSef)
			System.out.println("Boss nivel: "+this.nume);
		else
			System.out.println("Soldat: "+this.nume);
	}

	@Override
	public void adaugaElement(StructuraInamicaAbstracta nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void eliminaElement(StructuraInamicaAbstracta nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public StructuraInamicaAbstracta getElement(int index) {
		throw new UnsupportedOperationException();
	}
	
	
}
