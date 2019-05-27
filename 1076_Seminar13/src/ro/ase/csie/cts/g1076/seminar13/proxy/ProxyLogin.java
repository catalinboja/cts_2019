package ro.ase.csie.cts.g1076.seminar13.proxy;

import java.util.HashMap;

public class ProxyLogin implements InterfataLogin{

	InterfataLogin modulLogin;
	HashMap<String, Integer> contorIncercari;
	
	
	public ProxyLogin(InterfataLogin modulLogin) {
		this.modulLogin = modulLogin;
		this.contorIncercari = new HashMap<>();
	}

	public static final int NR_MAXIM_INCERCARI = 3;

	@Override
	public boolean esteAutentificat(String user, String pass) {
		
		Integer nrIncercari = contorIncercari.get(user);
		if(nrIncercari == null)
		{
			contorIncercari.put(user, 0);
		}
		else
		{
			if(nrIncercari >= NR_MAXIM_INCERCARI)
				return false;
		}
		
		boolean esteAutentificat = 
				modulLogin.esteAutentificat(user, pass);
		if(!esteAutentificat) {
			nrIncercari = contorIncercari.get(user);
			nrIncercari+=1;
			contorIncercari.put(user, nrIncercari);
		}
		
		return esteAutentificat;
	}

}
