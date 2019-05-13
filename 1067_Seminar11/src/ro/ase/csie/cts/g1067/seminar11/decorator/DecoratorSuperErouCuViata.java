package ro.ase.csie.cts.g1067.seminar11.decorator;

import ro.ase.csie.cts.g1067.seminar11.InterfataErou;

public class DecoratorSuperErouCuViata 
	extends DecoratorSuperErouAbstract{

	public DecoratorSuperErouCuViata(
			InterfataErou superErou) {
		super(superErou);
	}
	
	int puncteViata;

	public int getPuncteViata() {
		return puncteViata;
	}

	public void setPuncteViata(int puncteViata) {
		this.puncteViata = puncteViata;
	}
	
	

}
