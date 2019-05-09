package ro.ase.csie.cts.g1067.seminar10;

import java.util.ArrayList;

import ro.ase.csie.cts.g1067.seminar10.adapter.AdaptorClasaCaracterSuperErou;
import ro.ase.csie.cts.g1067.seminar10.adapter.AdaptorObiectCaracterJocLaSuperErou;
import ro.ase.csie.cts.g1067.seminar10.adapter.CaracterJoc;
import ro.ase.csie.cts.g1067.seminar10.adapter.InterfataSuperErou;
import ro.ase.csie.cts.g1067.seminar10.adapter.SuperErou;
import ro.ase.csie.cts.g1067.seminar10.prototype.Model3DSuperErou;

public class TestJoc {

	public static void main(String[] args) {
		
		//prototype
		
		Model3DSuperErou modelSuperMan = 
				new Model3DSuperErou("ErouPozitiv", 1000);
/*		Model3DSuperErou modelBatman = 
				new Model3DSuperErou("ErouPozitiv", 1000);*/
		
		Model3DSuperErou modelBatman = 
				(Model3DSuperErou) modelSuperMan.clonare();
		
		System.out.println("Modele generate !");
		
		//adapter
		
		SuperErou luke = 
				new SuperErou("Luke", 100, "sabie laser");
		luke.ataca("Vader");
		luke.esteLovit(50);
		if(luke.getPuncte()<=0)
			System.out.println("Game OVER !!!");
		
		//obiect din jocul cumparat
		CaracterJoc erou = 
				new CaracterJoc("Luke", 100);
		
		
		//definire colectie super eroi
		ArrayList<InterfataSuperErou> superEroi = 
				new ArrayList<>();
		superEroi.add(luke);
		superEroi.add(new AdaptorObiectCaracterJocLaSuperErou(erou));
		superEroi.add(
				new AdaptorClasaCaracterSuperErou("R2D2", 50, "soc electric"));
		
		System.out.println("-----------");
		
		for(InterfataSuperErou superErou : superEroi)
			superErou.ataca("Vader");
		
	}

}
