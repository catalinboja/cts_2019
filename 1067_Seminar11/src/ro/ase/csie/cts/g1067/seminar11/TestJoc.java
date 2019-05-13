package ro.ase.csie.cts.g1067.seminar11;

import ro.ase.csie.cts.g1067.seminar11.adapter.AdaptorSuperErouNonViolent;
import ro.ase.csie.cts.g1067.seminar11.decorator.DecoratorBatmanCuBatmobil;
import ro.ase.csie.cts.g1067.seminar11.decorator.DecoratorSuperErouCuViata;
import ro.ase.csie.cts.g1067.seminar11.facade.CaracterFiguratie;
import ro.ase.csie.cts.g1067.seminar11.facade.ElementActiv;
import ro.ase.csie.cts.g1067.seminar11.facade.FacadeScenariu;
import ro.ase.csie.cts.g1067.seminar11.facade.ImagineFundal;
import ro.ase.csie.cts.g1067.seminar11.facade.PovesteScenariu;

public class TestJoc {

	public static void main(String[] args) {

		//generare scenariu joc
		PovesteScenariu scenariu = 
				new PovesteScenariu("Salvare planeta");
		ImagineFundal background = 
				new ImagineFundal("fundal_Paris.jpg");
		CaracterFiguratie element1 = 
				new CaracterFiguratie("Avion pe cer");
		CaracterFiguratie element2 = 
				new CaracterFiguratie("Automobil pe strada");
		
		ElementActiv decor1 = 
				new ElementActiv("cladire");
		ElementActiv decor2 = 
				new ElementActiv("stalp iluminat stradal");
		
		scenariu.incarcaScenariu();
		element1.afisareEcran();
		element2.afisareEcran();
		decor1.incarcaInScenariu();
		decor2.incarcaInScenariu();
		
		//test Facade
		FacadeScenariu.incarcaScenariu(
				"Salvare planeta", "fundal_Paris.jpg",
				new String[] {"Avion pe cer","Automobil pe strada"},
				new String[] {"cladire","stalp iluminat stradal"});
		
		FacadeScenariu.incarcaScenariu(
				"Salvare planeta", "fundal_NewYork.jpg",
				new String[] {"Avion pe cer"},
				new String[] {"cladire","stalp iluminat stradal"});
		
		
		//test adapter
		SuperErou superman = 
				new SuperErou("Superman");
		superman.ataca("Joker");
		superman.seApara();
		
		AdaptorSuperErouNonViolent supermanNonViolent = 
				new AdaptorSuperErouNonViolent(superman);
		
		supermanNonViolent.interactioneaza("Joker");
		supermanNonViolent.alearga();
		
		SuperErou batman = 
				new SuperErou("Batman");
		
		//test decorator
		InterfataErou supermanCuViata = 
				new DecoratorSuperErouCuViata(superman);
		
		InterfataErou batmanCuBatmobil = 
				new DecoratorBatmanCuBatmobil(batman);
		
		batmanCuBatmobil.seApara();
		
		InterfataErou superBatman = 
				new DecoratorSuperErouCuViata(batmanCuBatmobil);
		
	}

}
