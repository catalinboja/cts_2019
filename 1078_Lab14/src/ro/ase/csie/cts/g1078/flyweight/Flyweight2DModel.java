package ro.ase.csie.cts.g1078.flyweight;

public class Flyweight2DModel implements Interface2DModelFlyweight {
	String type;
	String largeBitmap;
	
	public Flyweight2DModel(String type, String largeBitmap) {
		this.type = type;
		this.largeBitmap = largeBitmap;
		System.out.println("Creating a model for a "+type);
	}

	@Override
	public void displayOnScreen(String action, int X, int Y) {
		System.out.println(this.type + " and the image " + this.largeBitmap);
		System.out.println("Action: " + action);
		System.out.println("Coordinates: "+ X + "," + Y);
	}
	
	
}
