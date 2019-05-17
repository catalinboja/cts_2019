package ro.ase.csie.cts.g1078.seminar12.decorator;

public class SuperHero implements SuperHeroInterface{

	String name;
	String weapon;
		
	public SuperHero(String name, String weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}


	@Override
	public void run() {
		System.out.println(this.name + " is running");
	}


	@Override
	public void attack(String enemy) {
		System.out.println(this.name + " is attacking " + enemy + 
				" with " + this.weapon);
	}


	@Override
	public String getName() {
		return this.name;
	}
	
	
}
