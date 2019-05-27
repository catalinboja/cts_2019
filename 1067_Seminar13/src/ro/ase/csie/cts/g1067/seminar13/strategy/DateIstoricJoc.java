package ro.ase.csie.cts.g1067.seminar13.strategy;

import java.util.ArrayList;

public class DateIstoricJoc {
	ArrayList<Integer> durateSesiuniJoc;
	
	InterfataPrelucrariDate strategiePrelucrariDate;

	public void setStrategiePrelucrareDate(InterfataPrelucrariDate strategie) {
		this.strategiePrelucrariDate = strategie;
	}

	public DateIstoricJoc() {
		this.durateSesiuniJoc = new ArrayList<>();
	}
	
	public void inregistrareSesiuneNoua(int minute) {
		this.durateSesiuniJoc.add(minute);
	}
	
	public float getPrelucrari() {
		if(this.strategiePrelucrariDate != null)
			return this.strategiePrelucrariDate.faciCeVrei(
					this.durateSesiuniJoc);
		else
			throw new UnsupportedOperationException();
	}
	
	
}
