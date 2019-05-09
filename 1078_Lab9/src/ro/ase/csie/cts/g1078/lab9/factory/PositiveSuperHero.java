package ro.ase.csie.cts.g1078.lab9.factory;

public class PositiveSuperHero extends AbstractSuperHero{
	
	private String superPower;
	
	public PositiveSuperHero(
			String name, 
			int lifePoints,
			String superPower) {
		super(name, lifePoints, true);
		this.superPower = superPower;
	}

	
	
	
	
}
