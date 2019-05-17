package ro.ase.csie.cts.g1067.seminar12.composite;

public abstract class StructuraInamicaAbstracta {
	//metode specifice inamicilor
	public abstract void ataca(String erou);
	public abstract void seApara();
	
	public abstract void getInfo();
	
	//metode specifice grupurilor de inamici
	public abstract void adaugaElement(
			StructuraInamicaAbstracta nod);
	public abstract void eliminaElement(
			StructuraInamicaAbstracta nod);
	public abstract StructuraInamicaAbstracta getElement(int index);
}
