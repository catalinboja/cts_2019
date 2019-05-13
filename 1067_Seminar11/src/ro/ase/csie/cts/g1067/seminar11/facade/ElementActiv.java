package ro.ase.csie.cts.g1067.seminar11.facade;

public class ElementActiv {

	String descriere;

	public ElementActiv(String descriere) {
		super();
		this.descriere = descriere;
	}
	
	public void incarcaInScenariu() {
		System.out.println(
				this.descriere + " a fost incarcat");
	}
}
