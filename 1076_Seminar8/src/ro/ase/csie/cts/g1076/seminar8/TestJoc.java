package ro.ase.csie.cts.g1076.seminar8;

import ro.ase.csie.cts.g1076.seminar8.singleton.ModulLogin;
import ro.ase.csie.cts.g1076.seminar8.singleton.ModulProfil;

public class TestJoc {

	public static void main(String[] args) {
		
		System.out.println("Start joc");
		
		ModulLogin modulLogin = new ModulLogin("Gigel", "123456");
		modulLogin.login();
		
		ModulProfil modulProfil = new ModulProfil();
		modulProfil.getInfoProfil();
		
		modulProfil.getInfoProfil();
		
		
		
		
	}

}
