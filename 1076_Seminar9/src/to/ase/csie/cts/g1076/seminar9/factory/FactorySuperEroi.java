package to.ase.csie.cts.g1076.seminar9.factory;

public class FactorySuperEroi {
	public static SuperErouAbstract getSuperErou(
			TipSuperErou tip, String nume) {
		
		SuperErouAbstract superErou = null;
		switch (tip) {
		case POZITIV:
			superErou = 
			new SuperErouPozitiv(nume, "", 50);
			break;
		case NEGATIV:
			superErou =
			new SuperErouNegativ(nume, "", false);
			break;
		case NPC:
			superErou = new NPC(nume, true, "");
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return superErou;
	}
}
