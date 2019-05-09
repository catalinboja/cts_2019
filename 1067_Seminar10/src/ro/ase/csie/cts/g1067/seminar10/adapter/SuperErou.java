package ro.ase.csie.cts.g1067.seminar10.adapter;

public class SuperErou implements InterfataSuperErou{
	String nume;
	int puncteViata;
	String arma;
	
	
	public SuperErou(String nume, int puncteViata, String arma) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.arma = arma;
	}
	
	public void ataca(String inamic) {
		System.out.println(
				String.format("%s il ataca pe %s cu %s",
						nume,inamic,arma));
	}
	
	public void esteLovit(int puncte) {
		System.out.println(this.nume + " este lovit");
		this.puncteViata -= puncte;
	}
	
	public int getPuncte() {
		return this.puncteViata;
	}
}
