package ro.ase.csie.cts.g1067.seminar8.singleton;

public class ModulLogin {
	private String user;
	private String pass;
	
	public ModulLogin(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public boolean autentificare() {
/*		ConexiuneBD conexiune = 
				new ConexiuneBD("Server dev","127.0.0.1",3306);*/
		SingletonBD conexiune = 
				SingletonBD.getConexiuneBD();
		
		conexiune.conectare();
		
		System.out.println("Verifica credentiale user");
		
		return true;
		
	}
	
	
}
