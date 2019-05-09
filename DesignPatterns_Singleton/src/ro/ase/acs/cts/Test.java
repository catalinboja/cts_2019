package ro.ase.acs.cts;

import ro.ase.acs.cts.singleton.collection.version.LoggerFisier2;
import ro.ase.acs.cts.singleton.collection.version.SingletonCollection;
import ro.ase.acs.cts.singleton.enumeration.version.SingletonEnum;

public class Test {
	public static void main(String[] args) throws Exception {
		
		ConexiuneBD bd1 = 
				new ConexiuneBD("127.0.0.l:3060", "user", "12345678");
		
/*		ConexiuneBD bd2 = 
				new ConexiuneBD("127.0.0.l:3060", "user", "12345678");
		
		ConexiuneBD bd3 = 
				new ConexiuneBD("127.0.0.l:3060", "user", "12345678");
		*/
		System.out.println("Testare unicitate instanta Singleton");
		Singleton referinta1 = Singleton.getInstance();
		Singleton referinta2 = Singleton.getInstance();
		
		//verificare referinte
		if(referinta1==referinta2)
			System.out.println("Referintele sunt identice");
		else
			System.out.println("Obiecte diferite");
		
		LoggerFisier2 fileLog = 
				(LoggerFisier2) SingletonCollection.getInstance(LoggerFisier2.class.getName());
		
	}
	
	
	

	
}
