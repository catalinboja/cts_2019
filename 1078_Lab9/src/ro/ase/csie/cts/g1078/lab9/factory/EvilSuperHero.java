package ro.ase.csie.cts.g1078.lab9.factory;

public class EvilSuperHero extends AbstractSuperHero {
	private String evilWeapon;
	
	public EvilSuperHero(
			String name, 
			int lifePoints, 
			String weapon) {
		super(name, lifePoints, false);
		this.evilWeapon = weapon;
	}
}
