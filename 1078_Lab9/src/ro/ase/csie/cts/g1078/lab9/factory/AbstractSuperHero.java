package ro.ase.csie.cts.g1078.lab9.factory;

public abstract class AbstractSuperHero 
	implements ISuperHero{
	
	protected String name;
	protected int lifePoints;
	protected boolean isGood;
	
	@Override
	public void attack(ISuperHero other) {
		System.out.println(
				this.name + " attacks " + other.getName());
	}
	public String getName() {
		return this.name;
	}
	public void defend() {
		System.out.println(this.name + " is defending ");
	}
	public void takeAHit(int points) {
		System.out.println(this.name + "is hit ");
		this.lifePoints -= points;
	}
	public void run() {
		System.out.println(this.name + " is running ");
	}
	
	public AbstractSuperHero(String name, int lifePoints, boolean isGood) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.isGood = isGood;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	
	
	
}
