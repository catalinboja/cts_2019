package ro.ase.csie.cts.g1078.lab13.composite;

public class Soldier extends AbstractNode{
	String name;
	String weapon;
	boolean isLevelBoss;
	
	public Soldier(String name, String weapon, boolean isLevelBoss) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.isLevelBoss = isLevelBoss;
	}

	@Override
	public void attack(String name) {
		System.out.println(this.name + " is attacking " + name);
	}

	@Override
	public void defend() {
		System.out.println(this.name + " is defending");
	}

	@Override
	public void getInfo() {
		if(this.isLevelBoss)
			System.out.println("Level boss");
		System.out.println(this.name);
	}

	@Override
	public void addComponent(AbstractNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeComponent(AbstractNode node) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public AbstractNode getComponent(int index) {
		throw new UnsupportedOperationException();
	}
	
	
}
