package ro.ase.csie.cts.g1078.lab11.adapter;

public class SuperHero implements ISuperHero{
	String name;
	int lifePoints;
	
	public SuperHero(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	@Override
	public void attack(String enemy, int points) {
		System.out.println(this.name + " is attacking " + enemy + 
				". Enemy loses " + points + " points");
	}

	@Override
	public void defend(int points) {
		System.out.println(this.name + 
				" is defending and losing "+points);
		this.lifePoints -= points;
		if(this.lifePoints <= 0)
			System.out.println("Game Over");
	}
	
	
}
