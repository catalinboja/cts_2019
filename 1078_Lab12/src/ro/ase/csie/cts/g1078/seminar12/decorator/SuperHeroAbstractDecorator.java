package ro.ase.csie.cts.g1078.seminar12.decorator;

public abstract class SuperHeroAbstractDecorator implements SuperHeroInterface{
	
	SuperHeroInterface existingHero;

	public SuperHeroAbstractDecorator(SuperHeroInterface existingHero) {
		super();
		this.existingHero = existingHero;
	}
	
	public String getName() {
		return this.existingHero.getName();
	}
	
	
}
