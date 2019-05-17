package ro.ase.csie.cts.g1076.seminar12.decorator;

public abstract class DecoratorSuperErou implements InterfataSuperErou{

	InterfataSuperErou erouModificat;
	
	public DecoratorSuperErou(InterfataSuperErou erouExistent) {
		this.erouModificat = erouExistent;
	}
	
	public String getNume() {
		return this.erouModificat.getNume();
	}

}
