package ro.ase.csie.cts.g1078.lab13.proxy;

import java.util.HashMap;

public class LoginProxy implements InterfaceLogin{

	InterfaceLogin realLogin;
	HashMap<String, Integer> failedAttempts;
	
	public static final int NO_MAXIMUM_TRIES = 3;

	
	public LoginProxy(InterfaceLogin loginModule) {
		this.realLogin = loginModule;
		this.failedAttempts = new HashMap<>();
	}

	@Override
	public boolean login(String user, String pass) {

		Integer counter = failedAttempts.get(user);
		if(counter == null)
		{
			failedAttempts.put(user, 0);
		}
		else
		{
			if(counter >= NO_MAXIMUM_TRIES)
				return false;
		}
		
		boolean esteAutentificat = 
				realLogin.login(user, pass);
		if(!esteAutentificat) {
			counter = failedAttempts.get(user);
			counter += 1;
			failedAttempts.put(user, counter);
		}
		
		return esteAutentificat;
	}

}
