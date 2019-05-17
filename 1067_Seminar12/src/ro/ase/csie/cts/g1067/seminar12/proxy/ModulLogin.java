package ro.ase.csie.cts.g1067.seminar12.proxy;

public class ModulLogin implements InterfataModulLogin{

	String conexiuneBD;
	
	public ModulLogin(String conexiuneBD) {
		this.conexiuneBD = conexiuneBD;
	}

	@Override
	public boolean autentificare(String user, String pass) {
		System.out.println("Conectare la baza de date utilizatori");
		System.out.println("... "+conexiuneBD);
		//simulare verificare 
		if(user.equals("admin") && pass.equals("admin1234"))
			return true;
		else
			return false;
		
	}
	
}
