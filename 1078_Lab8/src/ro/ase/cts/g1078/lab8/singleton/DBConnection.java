package ro.ase.cts.g1078.lab8.singleton;

public class DBConnection {
	private String connection;
	private String ip;
	private int port;
	
	public DBConnection(String connection, String ip, int port) {
		System.out.println("Creating a DB connection");
		this.connection = connection;
		this.ip = ip;
		this.port = port;
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
