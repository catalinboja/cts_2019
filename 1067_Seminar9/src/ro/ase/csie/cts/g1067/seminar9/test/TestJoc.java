package ro.ase.csie.cts.g1067.seminar9.test;

import ro.ase.csie.cts.g1067.seminar9.builder.SuperSuperErou;
import ro.ase.csie.cts.g1067.seminar9.factory.FactorySuperErou;
import ro.ase.csie.cts.g1067.seminar9.factory.ISuperErou;
import ro.ase.csie.cts.g1067.seminar9.factory.NPC;
import ro.ase.csie.cts.g1067.seminar9.factory.SuperErouNegativ;
import ro.ase.csie.cts.g1067.seminar9.factory.SuperErouPozitiv;
import ro.ase.csie.cts.g1067.seminar9.factory.TipSuperErou;

public class TestJoc {
	public static void main(String[] args) {
		
/*		SuperErouPozitiv luke = 
				new SuperErouPozitiv("Luke", 60, 50, "Forta", 0);
		SuperErouNegativ vader = 
				new SuperErouNegativ("Vader", 50, "Forta");
		NPC robot = 
				new NPC("R2D2", 30, 0, "", true);*/
		
		ISuperErou luke = 
				FactorySuperErou.getSuperErou(
						TipSuperErou.POZITIV, "Luke", 60);
		ISuperErou vader = 
				FactorySuperErou.getSuperErou(
						TipSuperErou.NEGATIV, "Vader", 150);
		ISuperErou robot = 
				FactorySuperErou.getSuperErou(
						TipSuperErou.NPC, "R2D2", 50);
		
		//exemplu builder
/*		SuperSuperErou superErou = 
				new SuperSuperErou(
						"Luke","FOrta",true,);*/
		//initializare atribute cu set
		//superErou.setNume("Luke");
		
		SuperSuperErou luke2 = 
				new SuperSuperErou.SuperErouBuilder("Luke", 100, true)
				.adaugaSuperPutere("Forta")
				.esteRanitCritic()
				.build();

	}
}
