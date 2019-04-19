package ro.ase.csie.cts.g1067.seminar8.singleton;

public class ConexiuneBD {
	private String conexiune;
	private String ip;
	private int port;
	
	public ConexiuneBD(String conexiune, String ip, int port) {
		System.out.println("Creare conexiune noua");
		this.conexiune = conexiune;
		this.ip = ip;
		this.port = port;
	}
	
	public void conectare() {
		System.out.println(
				String.format("Conectare la %s - adresa %s:%d",
						conexiune, ip , port));
		
	}
	
	public void inchideConexiune() {
		System.out.println("Inchidere conexiune");
	}
	
	
	
}
