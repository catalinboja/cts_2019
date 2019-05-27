package ro.ase.cts;


//Client context
public class CaracterContext {
	private final int pozitieText;
	private boolean isCaps;
	
	public CaracterContext(int pozitie){
		this.pozitieText = pozitie;
	}
	
	public int getPozitie(){
		return this.pozitieText;
	}

}
