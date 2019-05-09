package ro.ase.acs.cts;

public abstract class FontAbstract {
	String denumire;
	int dimensiune;
	boolean esteItalic;
	
	public void aplicaFont(){
		System.out.println("Font "+denumire+", dimensiune: "+dimensiune+", italic: "+esteItalic);
	}
}
