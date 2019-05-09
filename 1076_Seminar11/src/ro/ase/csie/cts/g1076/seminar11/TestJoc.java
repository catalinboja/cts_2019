package ro.ase.csie.cts.g1076.seminar11;

import ro.ase.csie.cts.g1076.seminar11.adapter.AdaptorObiectHero;
import ro.ase.csie.cts.g1076.seminar11.adapter.Hero;
import ro.ase.csie.cts.g1076.seminar11.adapter.ISuperErou;
import ro.ase.csie.cts.g1076.seminar11.adapter.SuperErou;
import ro.ase.csie.cts.g1076.seminar11.prototype.Model3DSuperErou;

public class TestJoc {

	public static void main(String[] args) {
		
		//test fara prototype
/*		Model3DSuperErou superman = 
				new Model3DSuperErou("Superman", 1000);
		
		Model3DSuperErou batman = 
				new Model3DSuperErou("Batman", 1000);*/
		
		//test cu prototype
		Model3DSuperErou modelAbstract = 
				new Model3DSuperErou("", 1000);
		Model3DSuperErou superman = 
				(Model3DSuperErou) modelAbstract.clonare();
		superman.setNume("Superman");
		Model3DSuperErou batman = 
				(Model3DSuperErou) modelAbstract.clonare();
		superman.setNume("Batman");
		
		//test adapter
		SuperErou luke = new SuperErou("Luke", 1000);
		luke.ataca("Vader", 100);
		luke.seApara(10);
		
		Hero r2d2 = new Hero("R2D2");
/*		r2d2.loveste("Vader");
		r2d2.esteLovit();*/
		
		ISuperErou adaptorR2D2 = new AdaptorObiectHero(r2d2);
		adaptorR2D2.ataca("Vader", 0);
		adaptorR2D2.seApara(100);
	}

}
