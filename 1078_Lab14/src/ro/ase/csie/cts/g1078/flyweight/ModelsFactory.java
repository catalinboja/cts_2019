package ro.ase.csie.cts.g1078.flyweight;

import java.util.HashMap;

public class ModelsFactory {
	
	static HashMap<String, Interface2DModelFlyweight> models = 
			new HashMap<>();
	
	public static Interface2DModelFlyweight getModel(String type) {
		
		Interface2DModelFlyweight model = 
				models.get(type);
		if(model == null) {
			model = new Flyweight2DModel(type, "ModelImage.bmp");
			models.put(type, model);
		}
		
		return model;
	}
	
}
