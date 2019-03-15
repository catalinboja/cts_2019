package ro.ase.csie.cts.g1076.seminar4;

import ro.ase.csie.cts.g1076.seminar4.exceptii.ExceptieVectorNull;

public class OperatiiMatematice {
	private int[] valori;
	
	public OperatiiMatematice(int n) {
		this.valori = new int[n];
		for(int i=0;i<n;i++) {
			this.valori[i] = i+1;
		}
	}
	
	public OperatiiMatematice() {
		this.valori = null;
	}
	
	public int sumaElemente() throws ExceptieVectorNull {
		int s = 0;
		for(int valoare : this.valori) {
			s += valoare;
		}
		return s;
	}
}
