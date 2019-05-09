package ro.ase.csie.cts.g1076.seminar11.prototype;

import java.util.ArrayList;

public class Model3DSuperErou implements IPrototype{
	String nume;
	ArrayList<Integer> puncteModel;
	String culoare;
	
	public Model3DSuperErou(String nume, int nrPuncte) {
		this.nume = nume;
		//simulare cost creare obiect
		System.out.println("Generare puncte model 3D...");
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.puncteModel = new ArrayList<>(nrPuncte);
	}
	
	public Model3DSuperErou() {
		
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	@Override
	public Object clonare() {
		//deep-copy
		Model3DSuperErou clona = new Model3DSuperErou();
		clona.nume = this.nume;
		clona.puncteModel = (ArrayList<Integer>) this.puncteModel.clone();
		
		return clona;
	}
	
	
}
 