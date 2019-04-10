package ro.ase.csie.cts.g1076.seminar8.singleton;

public class ModulProfil {
	
	public void getInfoProfil() {
/*		ConexiuneBazaDeDate conexiune = 
				new ConexiuneBazaDeDate("Server utilizatori", 
						"127.0.0.1", 3306);*/
		
		SingletonBazaDeDate conexiune = 
				SingletonBazaDeDate.getConexiuneBazaDeDate();
		conexiune.deschideConexiune();
	}
}
