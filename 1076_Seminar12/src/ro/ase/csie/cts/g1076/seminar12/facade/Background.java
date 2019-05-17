package ro.ase.csie.cts.g1076.seminar12.facade;

public class Background {
	String imagineFundal;

	public Background(String imagineFundal) {
		super();
		this.imagineFundal = imagineFundal;
	}
	
	public void incarcaBackground() {
		System.out.println("A fost incarcata imaginea "+ 
	this.imagineFundal);
	}
}
