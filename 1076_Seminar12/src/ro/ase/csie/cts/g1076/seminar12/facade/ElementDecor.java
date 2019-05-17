package ro.ase.csie.cts.g1076.seminar12.facade;

public class ElementDecor {
	String element;

	public ElementDecor(String element) {
		super();
		this.element = element;
	}
	
	public void afisareEcran() {
		System.out.println(this.element + " a fost afisat");
	}
}
