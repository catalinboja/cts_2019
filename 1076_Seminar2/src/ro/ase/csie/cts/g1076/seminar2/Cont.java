package ro.ase.csie.cts.g1076.seminar2;

import ro.ase.csie.cts.g1076.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1076.seminar2.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract void depune(double valoare) throws ExceptieTransferIlegal;
	public abstract void extrage(double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void transfer(Cont destinatie,double valoare) throws ExceptieTransferIlegal, ExceptieFonduriInsuficiente;
	public abstract double getBalanta();
}