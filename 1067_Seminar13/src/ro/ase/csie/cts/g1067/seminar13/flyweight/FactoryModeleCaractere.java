package ro.ase.csie.cts.g1067.seminar13.flyweight;

import java.util.HashMap;

public class FactoryModeleCaractere {
	static HashMap<String, InterfataCaracterJoc> modele = 
			new HashMap<>();
	
	public static InterfataCaracterJoc getModelCaracter(String tipModel) {
		InterfataCaracterJoc model = 
				modele.get(tipModel);
		if(model == null)
		{
			model = new FlyweightCaracterJoc("Imagine "+tipModel);
			modele.put(tipModel, model);
		}
		return model;
	}
}
