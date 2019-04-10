package ro.ase.csie.cts.g1076.seminar8.singleton;

public class SingletonBazaDeDate {
	
	private String conexiune;
	private String ipServer;
	private int port;
	
	private static SingletonBazaDeDate singuraConexiune = null;
	
	private static String CONEXIUNE;
	private static String IP;
	private static int PORT;
	
	private SingletonBazaDeDate(String conexiune, String ipServer, int port) {
		System.out.println("Creare conexiune BD");
		this.conexiune = conexiune;
		this.ipServer = ipServer;
		this.port = port;
	}
	
	
	{
		System.out.println("Apelat automat inaintea oricarui constructor");
	}
	
	static {
		System.out.println("Apelata la incarcarea clasei de catre JVM");
		CONEXIUNE = "Server test";
		IP = "127.0.0.1";
		PORT = 3306;
	}
	
	//metoda prin care se solicita singleton-ul
	public synchronized static SingletonBazaDeDate getConexiuneBazaDeDate() {
		if(SingletonBazaDeDate.singuraConexiune == null)
			singuraConexiune = new SingletonBazaDeDate(CONEXIUNE, IP, PORT);
		return singuraConexiune;
	}
	
	
	public void deschideConexiune() {
		System.out.println(
				String.format("Conexiune catre %s la %s:%d",
						conexiune,ipServer,port));
	}
}
