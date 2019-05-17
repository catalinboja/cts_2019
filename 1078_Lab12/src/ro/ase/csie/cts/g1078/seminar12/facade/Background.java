package ro.ase.csie.cts.g1078.seminar12.facade;

public class Background {
	String backgroundImage;

	public Background(String backgroundImage) {
		super();
		this.backgroundImage = backgroundImage;
	}
	
	public void loadBackground() {
		System.out.println(this.backgroundImage + " has been loaded !");;
	}
}
