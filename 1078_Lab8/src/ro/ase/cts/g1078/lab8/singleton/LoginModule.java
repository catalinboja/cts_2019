package ro.ase.cts.g1078.lab8.singleton;

public class LoginModule {
	private String user;
	private String pass;
	
	public LoginModule(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	public boolean authenticate() {
		/*DBConnection dbConnection = 
				new DBConnection("Test DB", "127.0.0.1", 3306);
		dbConnection.connect();*/
		
		System.out.println("Getting a connection for login");
		
		SingletonDBConnection dbConnection = 
				SingletonDBConnection.getSingletonDBConnection();
		
		dbConnection.connect();
		
		System.out.println("Authenticating the user");
		
		return true;
	}
	
}
