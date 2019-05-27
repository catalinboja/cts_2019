package ro.ase.csie.cts.g1076.seminar14.flyweight;

import java.util.HashMap;

public class FactoryModele3D {
	private static HashMap<String, InterfataModel3DFlyweight> modele = new HashMap<>();
	
	public static InterfataModel3DFlyweight getModel(String tip) {
		InterfataModel3DFlyweight model = 
				modele.get(tip);
		if(model == null) {
			model = new FlyweightModel3D(tip);
			modele.put(tip, model);
		}
		
		return model;
	}
	
	
}
