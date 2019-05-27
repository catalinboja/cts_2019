package ro.ase.csie.cts.g1076.seminar13.composite;

public abstract class NodArmataAbstract {
	//metode specifice soldatilor
	public abstract void ataca(String nume);
	public abstract void seApara();
	public abstract void getInfo();
	
	//metode specifice nodurilor de legatura
	public abstract void adaugaElement(NodArmataAbstract nodCopil);
	public abstract void stergeElement(NodArmataAbstract nodCopil);
	public abstract NodArmataAbstract getElement(int index);
}
