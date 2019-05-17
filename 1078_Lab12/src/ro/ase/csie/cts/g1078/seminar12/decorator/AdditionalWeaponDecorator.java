package ro.ase.csie.cts.g1078.seminar12.decorator;

public class AdditionalWeaponDecorator extends SuperHeroAbstractDecorator{

	String extraWeapon;
	
	public AdditionalWeaponDecorator(SuperHeroInterface existingHero , 
			String extraWeapon) {
		super(existingHero);
		this.extraWeapon = extraWeapon;
	}

	@Override
	public void run() {
		this.existingHero.run();
	}

	@Override
	public void attack(String enemy) {
		this.existingHero.attack(enemy);
		System.out.println("He/She will also use a " + extraWeapon);
	}

}
