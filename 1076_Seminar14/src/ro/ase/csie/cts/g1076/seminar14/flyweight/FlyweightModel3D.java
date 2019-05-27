package ro.ase.csie.cts.g1076.seminar14.flyweight;

import java.util.ArrayList;

public class FlyweightModel3D implements InterfataModel3DFlyweight{

	//stare permanenta
	ArrayList<Integer> puncteModel;
	String tipModel;
	
	public FlyweightModel3D(String tipModel) {
		this.puncteModel = new ArrayList<>();
		this.tipModel = tipModel;
		System.out.println("Creare flyweight pentru " + tipModel);
	}

	@Override
	public void afisareEcran(String stare, int X, int Y) {
		System.out.println("Afisare  " + this.tipModel);
		System.out.println("Coordonate: " + X + ", " + Y);
		System.out.println("Stare: "+stare);
	}
	
	
}
