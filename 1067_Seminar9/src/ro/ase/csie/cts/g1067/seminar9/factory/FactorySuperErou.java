package ro.ase.csie.cts.g1067.seminar9.factory;

public class FactorySuperErou {
	
	public static ISuperErou getSuperErou(
			TipSuperErou tip, String nume, int viata) {
		ISuperErou erou = null;
		
		switch (tip) {
		case POZITIV:
			erou = new SuperErouPozitiv(nume, viata, 150, "", 0, 0);
			break;
		case NEGATIV:
			erou = new SuperErouNegativ(nume, 150, "");
			break;
		case NPC:
			erou = new NPC(nume, viata, 50, "", true);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return erou;
	}
}
