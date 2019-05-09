package ro.ase.csie.cts.g1078.lab9.factory;

public interface ISuperHero {
	public void attack(ISuperHero other);
	public void defend();
	public void takeAHit(int points);
	public void run();
	public String getName();
}
