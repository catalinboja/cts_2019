package to.ase.csie.cts.g1076.seminar9.factory;

public class SuperErouNegativ extends SuperErouAbstract{

	private boolean areLaser;
	
	public SuperErouNegativ(
			String nume, String superPutere, boolean areLaser) {
		super(nume, false, superPutere);
		this.areLaser = areLaser;
	}

}
