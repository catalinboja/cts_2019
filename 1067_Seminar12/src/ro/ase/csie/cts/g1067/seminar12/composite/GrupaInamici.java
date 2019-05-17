package ro.ase.csie.cts.g1067.seminar12.composite;

import java.util.ArrayList;

public class GrupaInamici extends StructuraInamicaAbstracta{
	
	String denumireGrupa;
	
	ArrayList<StructuraInamicaAbstracta> noduri;

	public GrupaInamici(String denumireGrupa) {
		this.denumireGrupa = denumireGrupa;
		this.noduri = new ArrayList<>();
	}

	@Override
	public void ataca(String erou) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void seApara() {
		for(StructuraInamicaAbstracta nod : noduri)
			nod.seApara();
	}

	@Override
	public void getInfo() {
		for(StructuraInamicaAbstracta nod : noduri)
			nod.getInfo();
	}

	@Override
	public void adaugaElement(StructuraInamicaAbstracta nod) {
		this.noduri.add(nod);
	}

	@Override
	public void eliminaElement(StructuraInamicaAbstracta nod) {
		this.noduri.remove(nod);
	}

	@Override
	public StructuraInamicaAbstracta getElement(int index) {
		return this.noduri.get(index);
	}
	
	
	
}
