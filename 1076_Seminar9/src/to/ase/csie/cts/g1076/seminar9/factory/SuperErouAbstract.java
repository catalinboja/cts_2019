package to.ase.csie.cts.g1076.seminar9.factory;

public abstract class SuperErouAbstract
	implements ISuperErou{

	protected String nume;
	protected boolean estePozitiv;
	protected String superPutere;
	
	
	public SuperErouAbstract(String nume, boolean estePozitiv, String superPutere) {
		super();
		this.nume = nume;
		this.estePozitiv = estePozitiv;
		this.superPutere = superPutere;
	}
	
	@Override
	public void ataca() {
		if(this.estePozitiv)
			System.out.println("Supereroul ataca un dusman");
		else
			System.out.println("Eroul negativ sparge o banca");
	}
	public void seApara() {
		System.out.println(this.nume + " se apara");
	}
	public void deplasare() {
		System.out.println(this.nume + " isi modifica locatia");
	}
}
