package ro.ase.csie.cts.g1067.seminar13.flyweight;

import java.util.ArrayList;

public class FlyweightCaracterJoc implements InterfataCaracterJoc{
	String imagineCaracter;
	ArrayList<Integer> puncteModel3D;
	
	public FlyweightCaracterJoc(String imagineCaracter) {
		this.imagineCaracter = imagineCaracter;
		this.puncteModel3D = new ArrayList<>();
	}

	@Override
	public void afisareEcran(StareTemporaraCaracter stareCaracter) {
		System.out.println(" ----- " + this.imagineCaracter);
		System.out.println("Ipostaza: " + stareCaracter.stare);
		System.out.println(
				"Coordonate: "+stareCaracter.x + "," + 
							stareCaracter.y);
	}
	
	
	
	
}
