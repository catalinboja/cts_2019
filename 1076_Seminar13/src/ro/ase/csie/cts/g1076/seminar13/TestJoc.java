package ro.ase.csie.cts.g1076.seminar13;

import ro.ase.csie.cts.g1076.seminar13.composite.NodArmataAbstract;
import ro.ase.csie.cts.g1076.seminar13.composite.NodGrupSoldati;
import ro.ase.csie.cts.g1076.seminar13.composite.SoldatInamic;
import ro.ase.csie.cts.g1076.seminar13.proxy.ModulLogin;
import ro.ase.csie.cts.g1076.seminar13.proxy.ProxyLogin;

public class TestJoc {

	
	public static void main(String[] args) {
		
		NodArmataAbstract armataNivel = new NodGrupSoldati("Level 5");
		
		
		NodArmataAbstract nivelIncepator = new NodGrupSoldati("Usor");
		nivelIncepator.adaugaElement(
				new SoldatInamic("Soldat 1", "pistol", false));
		nivelIncepator.adaugaElement(
				new SoldatInamic("Soldat 2", "pistol", false));
		
		NodArmataAbstract nivelMediu = new NodGrupSoldati("Mediu");
		nivelMediu.adaugaElement(
				new SoldatInamic("Boss nivel", "pistol", true));
		//ar fi frumos un clone pe nivelIncepator
		nivelMediu.adaugaElement(nivelIncepator);
		
		armataNivel.adaugaElement(nivelIncepator);
		armataNivel.adaugaElement(nivelMediu);
		
		armataNivel.getInfo();
		armataNivel.ataca("Batman");
		
		//test proxy - fara proxy
		String[] parolePosibile = 
				new String[] {"admin","1234","123456","admin12",
						"admin1234"};
		ModulLogin login = new ModulLogin();
		for(String parola : parolePosibile)
			if(login.esteAutentificat("admin", parola))
				System.out.println("Am ghicit parola - "+parola);
		
		//test proxy - cu proxy
		System.out.println("*************************");
		ProxyLogin proxy = new ProxyLogin(login);
		for(String parola : parolePosibile)
			if(proxy.esteAutentificat("admin", parola))
				System.out.println("Am ghicit parola - "+parola);
	}
			
}
