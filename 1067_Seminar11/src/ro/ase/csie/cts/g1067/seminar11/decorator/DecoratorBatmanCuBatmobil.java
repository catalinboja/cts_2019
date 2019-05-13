package ro.ase.csie.cts.g1067.seminar11.decorator;

import ro.ase.csie.cts.g1067.seminar11.InterfataErou;

public class DecoratorBatmanCuBatmobil 
	extends DecoratorSuperErouAbstract{

	public DecoratorBatmanCuBatmobil(InterfataErou superErou) {
		super(superErou);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seApara() {
		this.superErou.seApara();
		System.out.println("Foloseste Batmobilul !!!!");
	}
	
}
