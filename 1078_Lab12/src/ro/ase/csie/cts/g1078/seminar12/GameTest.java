package ro.ase.csie.cts.g1078.seminar12;

import ro.ase.csie.cts.g1078.seminar12.decorator.AdditionalWeaponDecorator;
import ro.ase.csie.cts.g1078.seminar12.decorator.FlyDecorator;
import ro.ase.csie.cts.g1078.seminar12.decorator.SuperHero;
import ro.ase.csie.cts.g1078.seminar12.decorator.SuperHeroInterface;
import ro.ase.csie.cts.g1078.seminar12.facade.Background;
import ro.ase.csie.cts.g1078.seminar12.facade.NPC;
import ro.ase.csie.cts.g1078.seminar12.facade.Props;
import ro.ase.csie.cts.g1078.seminar12.facade.ScenarioFacade;

public class GameTest {

	public static void main(String[] args) {

		//creating a scenario
		Background background = new Background("ParisScenario.png");
		Props tree = new Props("tree");
		Props building = new Props("building");
		
		NPC thief = new NPC("Thief");
		NPC badGuy = new NPC("Bad guy");
		
		background.loadBackground();
		tree.display();
		building.display();
		
		thief.run();
		badGuy.run();
		
		//facade test
		ScenarioFacade.initScenario("PacificScenario.png", 
				new String[] {"Palmier tree", "Bunker"},
				new String[] {"Enemy soldier", "Enemy plane"});
		
		//decorator
		SuperHero superman = new SuperHero("Superman", "laser");
		SuperHero batman = new SuperHero("Batman", "Bat-pistol");
		
		superman.run();
		batman.run();
		
		superman.attack("Joker");
		batman.attack("Joker");
		
		SuperHeroInterface superman2 = new FlyDecorator(superman);
		superman2.run();
		
		SuperHeroInterface batman2 = 
				new AdditionalWeaponDecorator(batman, "bat - super weapon");
		batman2.attack("Joker");
		
		SuperHeroInterface superman3 = 
				new AdditionalWeaponDecorator(superman2, "plasma gun");
		superman3.run();
		superman3.attack("Joker");
		
	}

}
