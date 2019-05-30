package ro.ase.csie.cts.g1078.lab14;

import java.util.ArrayList;
import java.util.Random;

import ro.ase.csie.cts.g1078.flyweight.Interface2DModelFlyweight;
import ro.ase.csie.cts.g1078.flyweight.ModelsFactory;

public class TestGame {

	public static void main(String[] args) {
		ArrayList<Interface2DModelFlyweight> soldiers = 
				new ArrayList<>();
		for(int i=0;i<5;i++)
			soldiers.add(ModelsFactory.getModel("Soldier"));
		
		for(Interface2DModelFlyweight soldier : soldiers) {
			Random random = new Random();
			String[] actions = new String[] {
					"Running","Crouching","Hiding","Play dead"};
			String action = actions[random.nextInt(4)];
			int X = random.nextInt(100);
			int Y = random.nextInt(100);
			soldier.displayOnScreen(action, X, Y);
		}
	}

}
