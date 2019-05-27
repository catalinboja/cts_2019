package ro.ase.csie.cts.g1076.seminar14;

import java.util.ArrayList;
import java.util.Random;

import ro.ase.csie.cts.g1076.seminar14.flyweight.FactoryModele3D;
import ro.ase.csie.cts.g1076.seminar14.flyweight.InterfataModel3DFlyweight;

public class TestJoc {

	public static void main(String[] args) {
		
		//definim 5 soldati care sa fie afisati pe ecran
		ArrayList<InterfataModel3DFlyweight> soldati = 
				new ArrayList<>();
				
		for(int i=0;i<5;i++) {
			soldati.add(FactoryModele3D.getModel("Soldat"));
		}
		
		for(InterfataModel3DFlyweight soldat : soldati) {
			String[] stari = new String[]{"Alearga", "Sta", "Doarme"};
			Random random = new Random();
			
			int X = random.nextInt(100);
			int Y = random.nextInt(100);
			String stare = stari[random.nextInt(3)];
			soldat.afisareEcran(stare, X, Y);
		}
		
	}

}
