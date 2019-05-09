package ro.ase.csie.cts.g1067.seminar10.prototype;

import java.util.ArrayList;

public class Model3DSuperErou implements IntertafataPrototype{
	
	private String tipModel;
	private ArrayList<Integer> puncte;
	
	private Model3DSuperErou() {
		
	}
	
	public Model3DSuperErou(String tip, int nrPuncte) {
		this.tipModel = tip;
		System.out.println("Generare model ...");
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.puncte = new ArrayList<>(nrPuncte);
	}

	@Override
	public Object clonare() {
		//deep-copy
		Model3DSuperErou clona = new Model3DSuperErou();
		clona.tipModel = this.tipModel;
		clona.puncte = (ArrayList<Integer>) this.puncte.clone();
		
		return clona;
	}
}
