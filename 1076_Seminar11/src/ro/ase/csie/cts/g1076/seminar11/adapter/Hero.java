package ro.ase.csie.cts.g1076.seminar11.adapter;

public class Hero implements InterfataHero{
	String nume;

	public Hero(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void loveste(String dusman) {
		System.out.println(">> " + dusman);
	}

	@Override
	public void esteLovit() {
		System.out.println("<< " + this.nume);
	}
	
	
}
