package ro.ase.csie.cts.g1076.seminar12;

import ro.ase.csie.cts.g1076.seminar12.decorator.DecoratorErouCareZboara;
import ro.ase.csie.cts.g1076.seminar12.decorator.DecoratorErouCuArmaSuplimentara;
import ro.ase.csie.cts.g1076.seminar12.decorator.SuperErou;
import ro.ase.csie.cts.g1076.seminar12.facade.Background;
import ro.ase.csie.cts.g1076.seminar12.facade.ElementDecor;
import ro.ase.csie.cts.g1076.seminar12.facade.FacadeScenariu;
import ro.ase.csie.cts.g1076.seminar12.facade.NPC;

public class TestJoc {
	
	public static void main(String[] args) {
		
		//test creare scenariu fara facade
		Background background = new Background("ScenariuParis.png");
		ElementDecor masinaPolitie = new ElementDecor("Masina politie");
		ElementDecor stalp = new ElementDecor("Stalp stradal");
		
		NPC bandit = new NPC("bandit");
		NPC hotMagazin = new NPC("Hot magazin");
		
		background.incarcaBackground();
		masinaPolitie.afisareEcran();
		stalp.afisareEcran();
		bandit.incarca();
		hotMagazin.incarca();
		
		//test creare scenariu cu Facade
		String[] elementeDecor = new String[] {"Avion","Cladire"};
		String[] elementeNPC = new String[] {"Soldat inamic","Tanc"};
		
		FacadeScenariu.generareScenariu("ScenariuPacific.png", 
				elementeDecor, elementeNPC);
		
		
		//test decorator
		SuperErou superman = new SuperErou("Superman", "laser");
		SuperErou batman = new SuperErou("Batman", "pumn");
		
		superman.alearga();
		batman.alearga();
		
		superman.ataca("Joker");
		batman.ataca("Joker");
		
		DecoratorErouCareZboara superman2 = 
				new DecoratorErouCareZboara(superman);
		superman2.alearga();
		
		DecoratorErouCuArmaSuplimentara batman2 = 
				new DecoratorErouCuArmaSuplimentara(batman, "pistol");
		batman2.ataca("Joker");
		
		//aplicare de decoratori in cascada
		DecoratorErouCuArmaSuplimentara superman3 = 
				new DecoratorErouCuArmaSuplimentara(superman2,"pistol cu plasma");
		superman3.alearga();
		superman3.ataca("Joker");
	}
}
