package ro.ase.csie.cts.g1067.seminar9.factory;

public abstract class SuperErou implements ISuperErou{
	protected String nume;
	protected int puncteViata;
	protected int nivelScut;
	protected String superPutere;
	protected boolean estePozitiv;
	
	
	public SuperErou(String nume, int puncteViata, int nivelScut, String superPutere, boolean estePozitiv) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.nivelScut = nivelScut;
		this.superPutere = superPutere;
		this.estePozitiv = estePozitiv;
	}
	
	public void ataca(String caracter) {
		System.out.println(
				String.format("%s il ataca pe %s",this.nume,caracter));
	}
	public void seApara() {
		System.out.println(this.nume + " se apara");
	}
	public void alearga() {
		System.out.println(this.nume + " alearga");
	}
}
