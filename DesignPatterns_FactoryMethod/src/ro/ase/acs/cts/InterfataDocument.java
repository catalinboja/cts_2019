package ro.ase.acs.cts;

public abstract class InterfataDocument {
	//atribute
	private String titlu;
	
	//metode abstracte
	public abstract String getTip();
	public abstract void print(String text);
	
	//metode
	public void setTitlu(String titlu){
		this.titlu = titlu;
	}
}
