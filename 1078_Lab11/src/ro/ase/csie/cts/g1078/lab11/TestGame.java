package ro.ase.csie.cts.g1078.lab11;

import ro.ase.csie.cts.g1078.lab11.adapter.ClassAdapterHero2SuperHero;
import ro.ase.csie.cts.g1078.lab11.adapter.Hero;
import ro.ase.csie.cts.g1078.lab11.adapter.HeroAdapter2SuperHero;
import ro.ase.csie.cts.g1078.lab11.adapter.ISuperHero;
import ro.ase.csie.cts.g1078.lab11.adapter.SuperHero;
import ro.ase.csie.cts.g1078.lab11.prototype.IPrototype;
import ro.ase.csie.cts.g1078.lab11.prototype.SuperHero3DModel;

public class TestGame {

	public static void main(String[] args) {
/*		
		SuperHero3DModel superman = 
				new SuperHero3DModel("Superman", "red", 1000);
		SuperHero3DModel batman = 
				new SuperHero3DModel("Batman", "black", 1000);*/
		
		SuperHero3DModel basicModel = 
				new SuperHero3DModel("", "", 1000);
		SuperHero3DModel superman = 
				(SuperHero3DModel) basicModel.cloneObject();
		superman.setName("Superman");
		SuperHero3DModel batman = 
				(SuperHero3DModel) basicModel.cloneObject();
		superman.setName("Batman");
		
		System.out.println("Game Over");
		
		SuperHero luke = new SuperHero("Luke", 100);
		luke.attack("Vader", 25);
		luke.defend(10);
		
		Hero r2d2 = new Hero("R2D2");
/*		r2d2.strike("Vader");
		r2d2.gotHit();*/
		
		ISuperHero r2d2SuperHero = 
				new HeroAdapter2SuperHero(r2d2);
		r2d2SuperHero.attack("Vader", 10);
		r2d2SuperHero.defend(5);
		
		//testing class adapters
		ISuperHero someRobot = 
				new ClassAdapterHero2SuperHero("Some robot");
		
		someRobot.attack("Vader", 10);
		someRobot.defend(5);
		
	}

}
