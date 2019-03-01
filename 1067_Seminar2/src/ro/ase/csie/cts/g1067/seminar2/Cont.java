package ro.ase.csie.cts.g1067.seminar2;

import ro.ase.csie.cts.g1067.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1067.seminar2.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract void depunere(Object suma) throws ExceptieTransferIlegal;
	public abstract void retrage(Object suma) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	public abstract double getBalanta();
	public abstract void transfer(Object suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
}