package ro.ase.csie.cts.g1067.seminar9.builder;

public class SuperSuperErou {
	private String nume;
	private String superPutere;
	private boolean estePozitiv;
	private boolean esteNPC;
	private int viata;
	private boolean esteRanitCritic;
	private String arma;
	
	
	
	public SuperSuperErou(String nume, String superPutere, boolean estePozitiv, boolean esteNPC, int viata,
			boolean esteRanitCritic, String arma) {
		super();
		this.nume = nume;
		this.superPutere = superPutere;
		this.estePozitiv = estePozitiv;
		this.esteNPC = esteNPC;
		this.viata = viata;
		this.esteRanitCritic = esteRanitCritic;
		this.arma = arma;
	}

	private SuperSuperErou() {
		
	}

	private void setNume(String nume) {
		this.nume = nume;
	}

	private void setSuperPutere(String superPutere) {
		this.superPutere = superPutere;
	}

	private void setEstePozitiv(boolean estePozitiv) {
		this.estePozitiv = estePozitiv;
	}

	private void setEsteNPC(boolean esteNPC) {
		this.esteNPC = esteNPC;
	}

	private void setViata(int viata) {
		this.viata = viata;
	}

	private void setEsteRanitCritic(boolean esteRanitCritic) {
		this.esteRanitCritic = esteRanitCritic;
	}

	private void setArma(String arma) {
		this.arma = arma;
	}

	
	public static class SuperErouBuilder{
		private SuperSuperErou erou;
		
		public SuperErouBuilder(String nume, 
				int viata, boolean estePozitiv) {
			erou = new SuperSuperErou();
			erou.setEstePozitiv(estePozitiv);
			erou.setNume(nume);
			erou.setViata(viata);
		}
		
		public SuperErouBuilder esteRanitCritic() {
			erou.setEsteRanitCritic(true);
			return this;
		}
		
		public SuperErouBuilder adaugaSuperPutere(String superPutere) {
			erou.setSuperPutere(superPutere);
			return this;
		}
		
		public SuperSuperErou build() {
			return this.erou;
		}
	}
	
}
