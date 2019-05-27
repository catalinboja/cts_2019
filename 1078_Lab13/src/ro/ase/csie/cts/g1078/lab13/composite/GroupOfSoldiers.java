package ro.ase.csie.cts.g1078.lab13.composite;

import java.util.ArrayList;

public class GroupOfSoldiers extends AbstractNode{
	
	String groupName;
	ArrayList<AbstractNode> components = new ArrayList<>();
	
	public GroupOfSoldiers(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public void attack(String name) {
		for(AbstractNode node : components)
			node.attack(name);
	}

	@Override
	public void defend() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void getInfo() {
		for(AbstractNode node : components)
			node.getInfo();
	}

	@Override
	public void addComponent(AbstractNode node) {
		components.add(node);
		
	}

	@Override
	public void removeComponent(AbstractNode node) {
		components.remove(node);
	}

	@Override
	public AbstractNode getComponent(int index) {
		return components.get(index);
	}
	
	

}
