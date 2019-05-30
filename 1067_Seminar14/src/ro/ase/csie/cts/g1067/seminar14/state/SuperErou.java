package ro.ase.csie.cts.g1067.seminar14.state;

public class SuperErou implements ActiuniSuperErou{
	String nume;
	int puncteViata;
	
	//referinta stare curenta
	InterfataStareSuperErou stareCurenta;
	
	public SuperErou(String nume) {
		super();
		this.nume = nume;
		this.puncteViata = 100;
		this.stareCurenta = new StareNormala();
	}

	@Override
	public void esteLovit(int puncte) {
		this.puncteViata -= puncte;
		if(this.puncteViata > 10 && 
				this.puncteViata < 75)
			this.stareCurenta = new StareRanit();
		if(this.puncteViata <= 10)
			this.stareCurenta = new StareRanitCritic();
	}

	@Override
	public void seDeplaseaza() {
		//System.out.println("Alearga !");
		this.stareCurenta.deplasare();
	}

	@Override
	public void ataca() {
		System.out.println("Se lupta !");
	}
	
	
	
	
}
