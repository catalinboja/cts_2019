package ro.ase.csie.cts.g1067.seminar12;

import ro.ase.csie.cts.g1067.seminar12.composite.GrupaInamici;
import ro.ase.csie.cts.g1067.seminar12.composite.Soldat;
import ro.ase.csie.cts.g1067.seminar12.composite.StructuraInamicaAbstracta;
import ro.ase.csie.cts.g1067.seminar12.proxy.ModulLogin;
import ro.ase.csie.cts.g1067.seminar12.proxy.ProxyLogin;

public class TestJoc {

	public static void main(String[] args) {
		//generam o armata de soldati pe mai multe niveluri
		GrupaInamici grupaMica = 
				new GrupaInamici("Grupa nivel usor");
		grupaMica.adaugaElement(new Soldat(false,"Soldat 1"));
		grupaMica.adaugaElement(new Soldat(false,"Soldat 2"));
		
		GrupaInamici grupaMedie = 
				new GrupaInamici("Grupa nivel mediu");
		grupaMedie.adaugaElement(new Soldat(false,"Soldat 1"));
		grupaMedie.adaugaElement(new Soldat(false,"Soldat 2"));
		grupaMedie.adaugaElement(new Soldat(true,"Lider grupa"));
		
		GrupaInamici armata = 
				new GrupaInamici("Toata armata");
		armata.adaugaElement(new Soldat(true,"Lider suprem"));
		armata.adaugaElement(grupaMedie);
		armata.adaugaElement(grupaMica);
		
		//armata.getInfo();
		grupaMedie.getInfo();
		armata.seApara();
		
		StructuraInamicaAbstracta liderSuprem = armata.getElement(0);
		liderSuprem.ataca("Batman");
		
		
		//test proxy
		ModulLogin modulLogin = 
				new ModulLogin("127.0.0.1 useri.sql");
		String[] dictionarParole = 
				new String[] {"admin","123456","admin","admin12",
						"admin1234"};
		
/*		for(String parola : dictionarParole) {
			if(modulLogin.autentificare("admin", parola))
				System.out.println("Yeay !!!! Parola este "+parola);
		}*/
		
		ProxyLogin proxyLogin = 
				new ProxyLogin(modulLogin);
		
		for(String parola : dictionarParole) {
			if(proxyLogin.autentificare("admin", parola))
				System.out.println("Yeay !!!! Parola este "+parola);
		}
		
	}

}
