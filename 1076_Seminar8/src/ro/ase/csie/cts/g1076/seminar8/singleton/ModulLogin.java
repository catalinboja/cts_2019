package ro.ase.csie.cts.g1076.seminar8.singleton;

public class ModulLogin {
	private String user;
	private String pass;
	public ModulLogin(String user, String pass) {
		System.out.println("Modul login");
		this.user = user;
		this.pass = pass;
	}
	
	public boolean login() {
/*		ConexiuneBazaDeDate conexiune = 
				new ConexiuneBazaDeDate("Server utilizatori", 
						"127.0.0.1", 3306);*/
		
		SingletonBazaDeDate conexiune = 
				SingletonBazaDeDate.getConexiuneBazaDeDate();
		conexiune.deschideConexiune();
		System.out.println("Incercare login");
		
		return true;
	}
}
