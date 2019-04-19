package to.ase.csie.cts.g1076.seminar9.builder;

public class SuperErou {
	private String nume;
	private boolean estePozitiv = true;
	private int puncteViata = 100;
	private String armaManaStanga = "";
	private String armaManaDreapta = "";
	private String superPutere = "";
	private boolean esteRanitCritic = false;
	private String superSuperPutere = "";
	public SuperErou(String nume, boolean estePozitiv, int puncteViata, String armaManaStanga, String armaManaDreapta,
			String superPutere, boolean esteRanitCritic, String superSuperPutere) {
		super();
		this.nume = nume;
		this.estePozitiv = estePozitiv;
		this.puncteViata = puncteViata;
		this.armaManaStanga = armaManaStanga;
		this.armaManaDreapta = armaManaDreapta;
		this.superPutere = superPutere;
		this.esteRanitCritic = esteRanitCritic;
		this.superSuperPutere = superSuperPutere;
	}
	
/*	public SuperErou() {
		
	}*/

	private void setNume(String nume) {
		this.nume = nume;
	}

	private void setEstePozitiv(boolean estePozitiv) {
		this.estePozitiv = estePozitiv;
	}

	private void setPuncteViata(int puncteViata) {
		this.puncteViata = puncteViata;
	}

	private void setArmaManaStanga(String armaManaStanga) {
		this.armaManaStanga = armaManaStanga;
	}

	public void setArmaManaDreapta(String armaManaDreapta) {
		this.armaManaDreapta = armaManaDreapta;
	}

	private void setSuperPutere(String superPutere) {
		this.superPutere = superPutere;
	}

	private void setEsteRanitCritic(boolean esteRanitCritic) {
		this.esteRanitCritic = esteRanitCritic;
	}

	private void setSuperSuperPutere(String superSuperPutere) {
		this.superSuperPutere = superSuperPutere;
	}
	
	
	public static class BuilderSuperErou{
		private SuperErou superErouConstruit = null;
		
		public BuilderSuperErou(String nume) {
			superErouConstruit = 
					new SuperErou(nume, 
							true, 100, 
							"", "", "", false, "");
		}
		
		public void esteNegativ() {
			this.superErouConstruit.estePozitiv = false;
		}
		
		public SuperErou build() {
			return this.superErouConstruit;
		}
	}
}
