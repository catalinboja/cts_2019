package ro.ase.csie.cts.g1076.seminar13.proxy;

public class ModulLogin implements InterfataLogin{

	@Override
	public boolean esteAutentificat(String user, String pass) {
		//simulare verificare credentiale admin
		if(user.equals("admin") && pass.equals("admin1234"))
				return true;
		else
			return false;
		
	}

}
