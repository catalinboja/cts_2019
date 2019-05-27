package ro.ase.csie.cts.g1078.lab13.proxy;

public class LoginServer implements InterfaceLogin{

	@Override
	public boolean login(String user, String pass) {
		//simulate login only for admin
		if(user.equals("admin") && pass.equals("admin1234"))
			return true;
		else
			return false;
	}

}
