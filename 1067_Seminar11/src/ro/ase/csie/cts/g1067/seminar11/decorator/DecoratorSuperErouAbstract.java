package ro.ase.csie.cts.g1067.seminar11.decorator;

import ro.ase.csie.cts.g1067.seminar11.InterfataErou;

public class DecoratorSuperErouAbstract 
	implements InterfataErou	{
	InterfataErou superErou;

	public DecoratorSuperErouAbstract(InterfataErou superErou) {
		super();
		this.superErou = superErou;
	}

	@Override
	public void ataca(String dusman) {
		this.superErou.ataca(dusman);
	}

	@Override
	public void seApara() {
		this.superErou.seApara();
	}
	
	
}
