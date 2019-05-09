package ro.ase.csie.cts.g1078.lab11.prototype;

import java.util.ArrayList;

public class SuperHero3DModel implements IPrototype {
	String name;
	String color;
	ArrayList<Integer> dots;
	
	private SuperHero3DModel() {
		
	}
	
	public SuperHero3DModel(String name, String color, int noPoints) {
		this.name = name;
		this.color = color;
		//simulate a costly process of generating the model dots
		System.out.println("Generating the 3D model ... ");
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {

		}
		this.dots = new ArrayList<>(noPoints);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDots(ArrayList<Integer> dots) {
		this.dots = dots;
	}

	@Override
	public Object cloneObject() {
		SuperHero3DModel clone = 
				new SuperHero3DModel();
		clone.name = this.name;
		clone.color = this.color;
		clone.dots = (ArrayList<Integer>) this.dots.clone();
		return clone;
	}
	
	
}
