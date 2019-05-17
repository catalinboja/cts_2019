package ro.ase.csie.cts.g1076.seminar12.facade;

public class FacadeScenariu {
	static public void generareScenariu(String imagineFundal,
			String[] elementeDecor, String[] listaNPC) {
		
		Background background = new Background(imagineFundal);
		background.incarcaBackground();
		
		for(String element : elementeDecor)
		{
			ElementDecor decor = new ElementDecor(element);
			decor.afisareEcran();
		}
		
		for(String npc : listaNPC) {
			NPC caracter = new NPC(npc);
			caracter.incarca();
		}
		
	}
}
