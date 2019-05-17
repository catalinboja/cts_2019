package ro.ase.csie.cts.g1078.seminar12.facade;

public class Props {
	String element;

	public Props(String element) {
		super();
		this.element = element;
	}
	
	public void display() {
		System.out.println(this.element + " displayed on the screen !");
	}
}
