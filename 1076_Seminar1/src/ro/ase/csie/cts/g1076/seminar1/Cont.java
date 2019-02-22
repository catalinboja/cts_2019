package ro.ase.csie.cts.g1076.seminar1;

public abstract class Cont {
	public abstract void depune(double valoare);
	public abstract void extrage(double valoare);
	public abstract void transfer(Cont destinatie,double valoare);
	public abstract double getBalanta();
}
