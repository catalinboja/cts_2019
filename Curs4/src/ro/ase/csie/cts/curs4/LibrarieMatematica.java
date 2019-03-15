package ro.ase.csie.cts.curs4;

import ro.ase.csie.cts.curs4.exceptii.ExceptieInputNegativ;

public class LibrarieMatematica {
	public static int adunaNumerePozitive(int a, int b) throws ExceptieInputNegativ {
		if(a < 0 || b < 0)
			throw new ExceptieInputNegativ();
		return a + b;
	}
}
