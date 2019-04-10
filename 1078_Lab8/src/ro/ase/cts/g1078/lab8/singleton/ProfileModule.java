package ro.ase.cts.g1078.lab8.singleton;

public class ProfileModule {
	
	public void getProfileInfo() {
/*		DBConnection dbConnection = 
				new DBConnection("Test DB", "127.0.0.1", 3306);
		dbConnection.connect();*/
		
		SingletonDBConnection dbConnection = 
				SingletonDBConnection.getSingletonDBConnection();
		
		dbConnection.connect();
		
		System.out.println("Getting user profile data");
	
	}
}
