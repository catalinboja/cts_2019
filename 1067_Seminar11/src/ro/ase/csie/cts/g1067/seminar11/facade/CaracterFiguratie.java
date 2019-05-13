package ro.ase.csie.cts.g1067.seminar11.facade;

public class CaracterFiguratie {

	String descriere;

	public CaracterFiguratie(String descriere) {
		super();
		this.descriere = descriere;
	}
	
	public void afisareEcran() {
		System.out.println(descriere);
	}
}
