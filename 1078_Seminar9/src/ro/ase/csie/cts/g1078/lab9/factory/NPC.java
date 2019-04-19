package ro.ase.csie.cts.g1078.lab9.factory;

public class NPC extends AbstractSuperHero{
	private boolean isHumanLike;
	private String weapon;
	
	public NPC(String name, int lifePoints, 
			boolean isGood, boolean isHuman, 
			String weapon) {
		super(name, lifePoints, isGood);
		this.isHumanLike = isHuman;
	}
	
	
	
}
