package ro.ase.csie.cts.course4;

import ro.ase.csie.cts.course4.exceptions.NegativeInputException;

public class MathLibrary {
	
	public static int addPositiveValues(int a, int b) throws NegativeInputException{
		if(a < 0 || b  < 0)
			throw new NegativeInputException();
		return a+b;
	}
}
