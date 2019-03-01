package ro.ase.csie.cts.g1078.lab2;

public class Utility {
	
	static public double getValueFromObject(Object value) {
		double receivedValue = 0;
		if(value instanceof Double)
			receivedValue = (Double)value;
		else
			throw new UnsupportedOperationException("Wrong type");
		return receivedValue;
	}

}
