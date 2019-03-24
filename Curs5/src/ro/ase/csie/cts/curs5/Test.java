package ro.ase.csie.cts.curs5;

import java.util.Random;

public class Test {
	
	public static int suma(Integer a, Integer b) throws ExceptieOverflow {
		if(Integer.MAX_VALUE - a < b)
			throw new ExceptieOverflow();
		return a + b;
	}
	
	public static int minim(int[] valori) {
		int min = valori[1];
		for(int valoare : valori)
			if(min > valoare)
				min = valoare;
		return min;
	}

	public static void main(String[] args) throws ExceptieOverflow {
		
		Random random = new Random();
		int valoare = random.nextInt(1000);
		
		System.out.println("Suma este " + suma(2,3));
		System.out.println("Suma este " + suma(3,2));
		System.out.println("Suma este " + suma(Integer.MAX_VALUE,1));
		
		int[] valori  = new int[] {6,4,1,8,10};
		System.out.println("Minim este " + minim(valori));
		valori  = new int[] {10,8,6,4,1};
		System.out.println("Minim este " + minim(valori));
		valori  = new int[] {1,4,6,8,10};
		System.out.println("Minim este " + minim(valori));
	}

}
