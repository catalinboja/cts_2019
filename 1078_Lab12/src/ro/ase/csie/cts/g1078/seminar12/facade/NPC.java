package ro.ase.csie.cts.g1078.seminar12.facade;

public class NPC {

	String name;

	public NPC(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		System.out.println(this.name + "- start action !");
	}
}
