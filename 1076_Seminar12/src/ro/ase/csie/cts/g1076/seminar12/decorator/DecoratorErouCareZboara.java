package ro.ase.csie.cts.g1076.seminar12.decorator;

public class DecoratorErouCareZboara extends DecoratorSuperErou{

	public DecoratorErouCareZboara(InterfataSuperErou erouExistent) {
		super(erouExistent);
	}

	@Override
	public void alearga() {
		System.out.println(this.erouModificat.getNume() + " zboara");
	}

	@Override
	public void ataca(String inamic) {
		this.erouModificat.ataca(inamic);	
	}

}
