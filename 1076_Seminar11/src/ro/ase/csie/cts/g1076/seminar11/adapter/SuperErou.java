package ro.ase.csie.cts.g1076.seminar11.adapter;

public class SuperErou implements ISuperErou{
	String nume;
	int puncteViata;
	
	public SuperErou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	@Override
	public void ataca(String Inamic, int puncte) {
		System.out.println(this.nume + " ataca pe " + 
				Inamic + ". Puncte lovitura: " + puncte);
	}

	@Override
	public void seApara(int puncte) {
		System.out.println(this.nume + " este lovit ");
		this.puncteViata -= puncte;
	}
	
	
}
