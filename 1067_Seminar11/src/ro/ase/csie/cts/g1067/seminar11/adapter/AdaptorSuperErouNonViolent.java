package ro.ase.csie.cts.g1067.seminar11.adapter;

import ro.ase.csie.cts.g1067.seminar11.InterfataErou;

public class AdaptorSuperErouNonViolent 
	implements InterfataErouNonViolent{
	InterfataErou superErou;

	public AdaptorSuperErouNonViolent(InterfataErou superErou) {
		super();
		this.superErou = superErou;
	}

	@Override
	public void interactioneaza(String prieten) {
		superErou.ataca(prieten);
	}

	@Override
	public void alearga() {
		superErou.seApara();
	}
	
	
}
