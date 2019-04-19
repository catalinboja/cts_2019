package ro.ase.csie.cts.g1067.seminar8.singleton;

public class SingletonBD {
	
	private String conexiune;
	private String ip;
	private int port;

	private static String CONEXIUNE;
	private static String IP;
	private static int PORT;
	
	private static SingletonBD conexiuneUnica = null;
	
	private boolean isConectat = false;
	
	static {
		System.out.println(
				"Apelat automat inainte ca JVM sa incarce clasa");
		CONEXIUNE = "Server Test";
		IP = "127.0.0.1";
		PORT = 3306;
	}
	
	{
		System.out.println("Apelat automat inainte oricarui constructor");
	}
	
	private SingletonBD(String conexiune, String ip, int port) {
		System.out.println("Creare conexiune noua");
		this.conexiune = conexiune;
		this.ip = ip;
		this.port = port;
	}
	
	public synchronized static SingletonBD getConexiuneBD() {
		if(conexiuneUnica == null)
			conexiuneUnica = new SingletonBD(CONEXIUNE,IP,PORT);
		return conexiuneUnica;
	}
	
	public void conectare() {
		if(!this.isConectat) {
		System.out.println(
				String.format("Conectare la %s - adresa %s:%d",
						conexiune, ip , port));
		this.isConectat  = true;
		}
		
	}
	
	public void inchideConexiune() {
		System.out.println("Inchidere conexiune");
		this.isConectat = false;
	}
	
}
