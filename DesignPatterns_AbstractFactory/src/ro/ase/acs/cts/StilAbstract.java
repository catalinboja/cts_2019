package ro.ase.acs.cts;

public abstract class StilAbstract {
	String denumire;
	String paragraf;
	
	public String getStil(){
		return denumire+" "+paragraf;
	}
}
