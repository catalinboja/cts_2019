package ro.ase.csie.cts.g1076.seminar8.singleton;

public class ConexiuneBazaDeDate {
	private String conexiune;
	private String ipServer;
	private int port;
	
	public ConexiuneBazaDeDate(String conexiune, String ipServer, int port) {
		System.out.println("Creare conexiune BD");
		this.conexiune = conexiune;
		this.ipServer = ipServer;
		this.port = port;
	}
	
	
	public void deschideConexiune() {
		System.out.println(
				String.format("Conexiune catre %s la %s:%d",
						conexiune,ipServer,port));
	}
	
	
}
