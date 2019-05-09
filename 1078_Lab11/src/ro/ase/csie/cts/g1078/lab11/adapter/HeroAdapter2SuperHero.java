package ro.ase.csie.cts.g1078.lab11.adapter;

public class HeroAdapter2SuperHero implements ISuperHero{
	HeroInterface hero;

	public HeroAdapter2SuperHero(HeroInterface hero) {
		this.hero = hero;
	}

	@Override
	public void attack(String enemy, int points) {
		this.hero.strike(enemy);
	}

	@Override
	public void defend(int points) {
		this.hero.gotHit();
	}
	
	
	
	
}
