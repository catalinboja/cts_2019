package ro.ase.cts.g1078.lab8;

import ro.ase.cts.g1078.lab8.singleton.LoginModule;
import ro.ase.cts.g1078.lab8.singleton.ProfileModule;

public class GameTest {

	public static void main(String[] args) {
		
		System.out.println("Game starting");
		
		LoginModule login = new LoginModule("John","123456");
		if(login.authenticate()) {
			ProfileModule profile = new ProfileModule();
			profile.getProfileInfo();
			
			profile.getProfileInfo();
		}
		
	}

}
