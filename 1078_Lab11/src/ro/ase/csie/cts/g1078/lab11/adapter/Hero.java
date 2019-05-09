package ro.ase.csie.cts.g1078.lab11.adapter;

public class Hero implements HeroInterface{
	String heroName;

	public Hero(String heroName) {
		super();
		this.heroName = heroName;
	}

	@Override
	public void strike(String otherHero) {
		System.out.println(" >> " + otherHero);
	}

	@Override
	public void gotHit() {
		System.out.println(this.heroName + " << ");
		
	}
	
	
}
