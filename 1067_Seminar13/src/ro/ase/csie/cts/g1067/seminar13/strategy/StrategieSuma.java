package ro.ase.csie.cts.g1067.seminar13.strategy;

import java.util.ArrayList;

public class StrategieSuma implements InterfataPrelucrariDate{

	@Override
	public float faciCeVrei(ArrayList<Integer> date) {
		float suma = 0;
		for(int valoare : date)
			suma += valoare;
		
		return suma;
	}

}
