package ro.ase.csie.cts.g1067.seminar10.adapter;

public class AdaptorClasaCaracterSuperErou 
	extends CaracterJoc implements InterfataSuperErou{

	public AdaptorClasaCaracterSuperErou(
			String nume, int puncteViata, String arma) {
		super(nume, puncteViata);
	}

	@Override
	public void ataca(String inamic) {
		this.atacaInamic(inamic, "", 10);
	}

	@Override
	public void esteLovit(int puncte) {
		this.seApara();
		this.puncte -= puncte;
	}

	@Override
	public int getPuncte() {
		return this.puncte;
	}
	
	

}
