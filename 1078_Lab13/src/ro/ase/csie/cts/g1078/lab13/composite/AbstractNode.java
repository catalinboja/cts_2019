package ro.ase.csie.cts.g1078.lab13.composite;

public abstract class AbstractNode {
	//methods specific to soldiers
	public abstract void attack(String name);
	public abstract void defend();
	public abstract void getInfo();
	
	//methods specific to composite nodes
	public abstract void addComponent(AbstractNode node);
	public abstract void removeComponent(AbstractNode node);
	public abstract AbstractNode getComponent(int index);
}
