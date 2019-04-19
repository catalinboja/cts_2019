package ro.ase.csie.cts.g1067.seminar8.singleton;

public class ModulProfil {
	
	
	public void getProfil(String user) {
		/*		ConexiuneBD conexiune = 
		new ConexiuneBD("Server dev","127.0.0.1",3306);*/
		SingletonBD conexiune = 
				SingletonBD.getConexiuneBD();

		conexiune.conectare();
		
		System.out.println("Afisare profil pentru " + user);
	}
}
