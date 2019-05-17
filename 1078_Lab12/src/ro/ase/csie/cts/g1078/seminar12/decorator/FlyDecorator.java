package ro.ase.csie.cts.g1078.seminar12.decorator;

public class FlyDecorator extends SuperHeroAbstractDecorator{

	public FlyDecorator(SuperHeroInterface existingHero) {
		super(existingHero);
	}

	@Override
	public void run() {
		System.out.println(this.existingHero.getName() + " is flying !");
	}

	@Override
	public void attack(String enemy) {
		this.existingHero.attack(enemy);
	}
	
}
