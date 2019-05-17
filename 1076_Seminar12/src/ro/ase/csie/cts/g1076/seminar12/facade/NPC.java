package ro.ase.csie.cts.g1076.seminar12.facade;

public class NPC {
	String nume;

	public NPC(String nume) {
		super();
		this.nume = nume;
	}
	
	public void incarca() {
		System.out.println(this.nume + " a fost incarcat");
	}
}
