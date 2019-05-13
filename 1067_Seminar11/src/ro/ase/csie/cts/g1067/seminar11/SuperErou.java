package ro.ase.csie.cts.g1067.seminar11;

public class SuperErou implements InterfataErou{
	String nume;

	public SuperErou(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void ataca(String dusman) {
		System.out.println(
				this.nume + " ataca pe " + dusman);
	}

	@Override
	public void seApara() {
		System.out.println(this.nume + " se apara ");
	}
	
	
}
