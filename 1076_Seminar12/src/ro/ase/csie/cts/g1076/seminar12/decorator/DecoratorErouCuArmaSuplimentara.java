package ro.ase.csie.cts.g1076.seminar12.decorator;

public class DecoratorErouCuArmaSuplimentara extends DecoratorSuperErou{

	String armaSuplimentara;
	
	public DecoratorErouCuArmaSuplimentara(
			InterfataSuperErou erouExistent, String arma) {
		super(erouExistent);
		this.armaSuplimentara = arma;
	}

	@Override
	public void alearga() {
		this.erouModificat.alearga();
	}

	@Override
	public void ataca(String inamic) {
		this.erouModificat.ataca(inamic);
		System.out.println("Il ataca si cu "+armaSuplimentara);
	}

}
