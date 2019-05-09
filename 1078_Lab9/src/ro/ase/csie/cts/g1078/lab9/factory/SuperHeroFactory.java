package ro.ase.csie.cts.g1078.lab9.factory;

public class SuperHeroFactory {
	public static AbstractSuperHero getHero(
			SuperHeroTypes type, String name) {
		AbstractSuperHero hero = null;
		
		switch (type) {
		case POSITIVE:
			hero = new PositiveSuperHero(
					name, 100, "");
			break;
		case EVIL:
			hero = new EvilSuperHero(
					name, 200, "laser sword");
			break;
		case NPC:
			hero = new NPC(name, 50, true, false, "");
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return hero;
	}
}
