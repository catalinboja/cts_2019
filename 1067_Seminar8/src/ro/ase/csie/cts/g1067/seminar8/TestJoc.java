package ro.ase.csie.cts.g1067.seminar8;

import ro.ase.csie.cts.g1067.seminar8.singleton.ModulLogin;
import ro.ase.csie.cts.g1067.seminar8.singleton.ModulProfil;

public class TestJoc {

	public static void main(String[] args) {
		
		System.out.println("Start joc");
		
		ModulLogin login = new ModulLogin("Gigel", "1234");
		if(login.autentificare())
		{
			ModulProfil profil = new ModulProfil();
			profil.getProfil("Gigel");
			
			//se joaca
			//se intoarce la profil
			
			profil.getProfil("Gigel");
			
		}
	}

}
