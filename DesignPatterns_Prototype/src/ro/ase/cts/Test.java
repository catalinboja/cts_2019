package ro.ase.cts;

import ro.ase.cts.prototype.Asteroid;
import ro.ase.cts.prototype.Model3D;
import ro.ase.cts.prototype.NavaSpatiala;
import ro.ase.cts.prototype.factory.PrototypeFactory;

public class Test {

	public static void main(String[] args) {
		
		NavaSpatiala nava1 = new NavaSpatiala("Klingoniana");
		nava1.setId("1");
		Asteroid astero1 = new Asteroid();
	
		System.out.println(nava1);
		System.out.println(astero1);
		
		NavaSpatiala nava2 = (NavaSpatiala) nava1.clone();
		nava2.setId("2");
		System.out.println(nava2);
		
		
		Model3D modelNava = PrototypeFactory.getPrototip("nava");
		if(modelNava!=null)
			System.out.println(modelNava);
	
		
		//shallow-copy test
		if(nava1.getVertices() == nava2.getVertices())
			System.out.println("!!!!!!!!!! Acelasi set de poligoane");
		
	}

}
