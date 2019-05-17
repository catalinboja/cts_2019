package ro.ase.csie.cts.g1078.seminar12.facade;

public class ScenarioFacade {
	static public void initScenario(String backgroundImage,
			String[] props, String[] npcs) {
		
		Background background = new Background(backgroundImage);
		background.loadBackground();
		
		for(String prop : props) {
			Props element = new Props(prop);
			element.display();
		}
		
		for(String npc : npcs) {
			NPC computer = new NPC(npc);
			computer.run();
		}
	}
}
