package ro.ase.csie.cts.g1067.seminar10.adapter;

public class AdaptorObiectCaracterJocLaSuperErou 
implements InterfataSuperErou{
	private CaracterJoc erou;

	public AdaptorObiectCaracterJocLaSuperErou(CaracterJoc erou) {
		this.erou = erou;
	}

	@Override
	public void ataca(String inamic) {
		erou.atacaInamic(inamic, "", 10);
	}

	@Override
	public void esteLovit(int puncte) {
		erou.seApara();
		erou.puncte -= puncte;
	}

	@Override
	public int getPuncte() {
		return erou.puncte;
	}
	
	
}
