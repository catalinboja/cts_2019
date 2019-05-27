package ro.ase.csie.cts.g1067.seminar13.flyweight;

import java.util.ArrayList;
import java.util.Random;

import ro.ase.csie.cts.g1067.seminar13.strategy.DateIstoricJoc;
import ro.ase.csie.cts.g1067.seminar13.strategy.InterfataPrelucrariDate;
import ro.ase.csie.cts.g1067.seminar13.strategy.StrategieSuma;

public class TestJoc {
	
	static String getStareRandom() {
		String[] stari = {"alearga", "sare", "merge", "sta"};
		Random random = new Random();
		return stari[random.nextInt(4)];
	}

	public static void main(String[] args) {
		
		//incarcam o armata de soldati + comandanti
		ArrayList<InterfataCaracterJoc> soldati = 
				new ArrayList<>();
		soldati.add(FactoryModeleCaractere.getModelCaracter("Soldat"));
		soldati.add(FactoryModeleCaractere.getModelCaracter("Soldat"));
		soldati.add(FactoryModeleCaractere.getModelCaracter("Comandant"));
		soldati.add(FactoryModeleCaractere.getModelCaracter("Soldat"));
		
		for(InterfataCaracterJoc soldat : soldati) {
			Random random = new Random();
			StareTemporaraCaracter stare = 
					new StareTemporaraCaracter(
							getStareRandom(), 
							random.nextInt(100),
							random.nextInt(100));
			soldat.afisareEcran(stare);
		}
		
		//test strategy
		DateIstoricJoc istoric = 
				new DateIstoricJoc();
		istoric.inregistrareSesiuneNoua(35);
		istoric.inregistrareSesiuneNoua(50);
		istoric.inregistrareSesiuneNoua(80);
		
		istoric.setStrategiePrelucrareDate(new StrategieSuma());;
	
		istoric.setStrategiePrelucrareDate(new InterfataPrelucrariDate() {
			
			@Override
			public float faciCeVrei(ArrayList<Integer> date) {
				float min = date.get(0);
				for(int valoare : date)
					if(min > valoare)
						min = valoare;
				return min;
			}
		});
		
		float durataTotala = 
				istoric.getPrelucrari();
		
		System.out.println("Rezultat prelucrari : " + durataTotala);
	}
	
	

}
