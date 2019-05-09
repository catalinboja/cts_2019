package ro.ase.csie.cts.g1078.lab9;

import ro.ase.csie.cts.g1078.lab9.factory.AbstractSuperHero;
import ro.ase.csie.cts.g1078.lab9.factory.EvilSuperHero;
import ro.ase.csie.cts.g1078.lab9.factory.NPC;
import ro.ase.csie.cts.g1078.lab9.factory.PositiveSuperHero;
import ro.ase.csie.cts.g1078.lab9.factory.SuperHeroFactory;
import ro.ase.csie.cts.g1078.lab9.factory.SuperHeroTypes;

public class TestGame {

	public static void main(String[] args) {
		
/*		PositiveSuperHero luke = 
				new PositiveSuperHero(
						"Luke", 100, "The Force");
		EvilSuperHero vader = 
				new EvilSuperHero(
						"Darth Vader", 100, "The force");
		NPC justARobot = 
				new NPC("R2D2",50,true,false,"");*/
		
		AbstractSuperHero luke = 
				SuperHeroFactory.getHero(
						SuperHeroTypes.POSITIVE, "Luke");
		AbstractSuperHero vader = 
				SuperHeroFactory.getHero(
						SuperHeroTypes.EVIL, "Vader");
		AbstractSuperHero robot = 
				SuperHeroFactory.getHero(
						SuperHeroTypes.NPC, "R2D2");
		
		
	}

}
