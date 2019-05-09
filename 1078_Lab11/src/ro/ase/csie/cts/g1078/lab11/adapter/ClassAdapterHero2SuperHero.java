package ro.ase.csie.cts.g1078.lab11.adapter;

public class ClassAdapterHero2SuperHero extends Hero implements ISuperHero{

	public ClassAdapterHero2SuperHero(String heroName) {
		super(heroName);
	}

	@Override
	public void attack(String enemy, int points) {
		this.strike(enemy);
	}

	@Override
	public void defend(int points) {
		this.gotHit();
	}

}
