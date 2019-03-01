package ro.ase.csie.cts.g1067.seminar2;

public class Util {
	
	static public double getDouble(Object valoare) {
		double valoarePrimita = 0;
		if(valoare instanceof Double)
			valoarePrimita = (Double)valoare;
		else
			throw new UnsupportedOperationException();
		return valoarePrimita;
	}
}
