package ro.ase.cts.g1078.lab8.singleton;

public class SingletonDBConnection {
	private String connection;
	private String ip;
	private int port;
	
	private static String CONNECTION;
	private static String IP;
	private static int PORT;
	
	private static SingletonDBConnection singleConnection = null;
	
	
	static {
		CONNECTION = "MY development DB";
		IP = "127.0.0.1";
		PORT = 3306;
		
		System.out.println("Called only once before the class is loaded by JVM");
	}
	
	
	{
		System.out.println("Called everytime before a constructor is called");
	}
	
	
	private SingletonDBConnection(String connection, String ip, int port) {
		System.out.println("Creating a DB connection");
		this.connection = connection;
		this.ip = ip;
		this.port = port;
	}
	
	public static synchronized SingletonDBConnection getSingletonDBConnection() {
		if(singleConnection == null) {
			singleConnection = 
			new SingletonDBConnection(CONNECTION, IP, PORT);
		}
		return singleConnection;
	}
	
	public void connect() {
		System.out.println(
				String.format("Connecting to %s on %s:%d",
						this.connection,ip, port));
	}
	
	public void disconnect() {
		System.out.println("Releasing the connection.");
	}
}
