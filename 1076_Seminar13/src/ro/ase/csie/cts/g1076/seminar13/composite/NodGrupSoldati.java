package ro.ase.csie.cts.g1076.seminar13.composite;

import java.util.ArrayList;

public class NodGrupSoldati extends NodArmataAbstract{
	
	ArrayList<NodArmataAbstract> componente = new ArrayList<>();
	
	String denumireGrup;

	public NodGrupSoldati(String denumireGrup) {
		this.denumireGrup = denumireGrup;
	}

	@Override
	public void ataca(String nume) {
		for(NodArmataAbstract nod : componente)
			nod.ataca(nume);
	}

	@Override
	public void seApara() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void getInfo() {
		for(NodArmataAbstract nod : componente)
			nod.getInfo();
	}

	@Override
	public void adaugaElement(NodArmataAbstract nodCopil) {
		this.componente.add(nodCopil);
	}

	@Override
	public void stergeElement(NodArmataAbstract nodCopil) {
		this.componente.remove(nodCopil);
	}

	@Override
	public NodArmataAbstract getElement(int index) {
		return this.componente.get(index);
	}
	
	
	
}
