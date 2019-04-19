package to.ase.csie.cts.g1076.seminar9;

import to.ase.csie.cts.g1076.seminar9.factory.FactorySuperEroi;
import to.ase.csie.cts.g1076.seminar9.factory.NPC;
import to.ase.csie.cts.g1076.seminar9.factory.SuperErouNegativ;
import to.ase.csie.cts.g1076.seminar9.factory.SuperErouPozitiv;
import to.ase.csie.cts.g1076.seminar9.factory.TipSuperErou;

public class TestJoc {

	public static void main(String[] args) {
		
		SuperErouPozitiv superMan = 
				new SuperErouPozitiv("Superman",
						"zboara", 100);
		SuperErouNegativ joker = 
				new SuperErouNegativ(
						"Joker", "Bombe", false);
		NPC politist = 
				new NPC("Politist", true, "nimic");
		
		
		superMan = 
				(SuperErouPozitiv)FactorySuperEroi.getSuperErou(
						TipSuperErou.POZITIV, "Superman");
		joker = (SuperErouNegativ)
				FactorySuperEroi.getSuperErou(
						TipSuperErou.NEGATIV, "Joker");
		politist = (NPC)
				FactorySuperEroi.getSuperErou(
						TipSuperErou.NPC, "Politist");
				
		
	}

}
