package to.ase.csie.cts.g1076.seminar9.factory;

public class SuperErouPozitiv extends SuperErouAbstract{
	private int durataInvizibilitate;

	public SuperErouPozitiv(String nume,
			String superPutere,
			int durataInvizibilitate) {
		super(nume,true,superPutere);
		this.durataInvizibilitate = durataInvizibilitate;
	}
	
	
}
