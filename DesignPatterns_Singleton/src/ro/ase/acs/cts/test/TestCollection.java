package ro.ase.acs.cts.test;

import ro.ase.acs.cts.singleton.collection.version.LoggerFisier2;
import ro.ase.acs.cts.singleton.collection.version.LoggerInterface;
import ro.ase.acs.cts.singleton.collection.version.SingletonCollection;
import ro.ase.acs.cts.singleton.enumeration.version.SingletonEnum;

public class TestCollection {

	public static void main(String[] args) {
		
		//LoggerConsola consola = new LoggerConsola();
		
		//obtinem referinta catre SingletonCollection
		//SingletonCollection loggerCollection = SingletonCollection.LoggerCollection;
		
		//obtin referintele unice catre diferite tipuri de Logger
		LoggerInterface loggerConsola = 
				SingletonCollection.getInstance(
						"ro.ase.acs.cts.singleton.collection.version.LoggerConsola2");
		LoggerInterface loggerFisier = 
				SingletonCollection.getInstance(
						"ro.ase.acs.cts.singleton.collection.version.LoggerFisier2");
		
		//test logger
		loggerConsola.printLog("Test log");
		
		//cerere catre o noua referinta LoggerConsola
		LoggerInterface  loggerConsola2 = 
				SingletonCollection.getInstance("ro.ase.acs.cts.singleton.collection.version.LoggerConsola2");
		
		//verificare egalitate referinte
		if(loggerConsola==loggerConsola2)
			System.out.println("Referintele sunt identice");
		else
			System.out.println("Obiecte diferite");
		
		
		LoggerFisier2 log2 = new LoggerFisier2();
		LoggerFisier2 log3 = new LoggerFisier2();
		LoggerFisier2 log4 = new LoggerFisier2();
		LoggerFisier2 log5 = new LoggerFisier2();
		
		
		SingletonEnum.INSTANCE.metodaObiect();
		
		SingletonEnum altaReferinta = 
				SingletonEnum.INSTANCE;
		
		altaReferinta.metodaObiect();
	}

}
