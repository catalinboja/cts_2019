package ro.ase.csie.cts.g1078.lab4;

import ro.ase.csie.cts.g1078.lab4.exceptions.ExceptionZeroValues;

public class MyArray {
	private int[] values;
	
	public MyArray(int n) {
		this.values = new int[n];
		for(int i=0;i<n;i++) {
			this.values[i] = i+1;
		}
	}
	
	public MyArray() {
		this.values = null;
	}
	
	public int elementsSum() throws ExceptionZeroValues{
		int sum = 0;
		for(int value : this.values)
			sum+=value;
		return sum;
	}
	
	
	
}
