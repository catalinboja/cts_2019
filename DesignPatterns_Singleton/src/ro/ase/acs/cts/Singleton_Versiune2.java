package ro.ase.acs.cts;


public class Singleton_Versiune2 {
	//referinta instanta unica
	
    public static final Singleton_Versiune2 instance;
   
    static {
    	instance = 
        		new Singleton_Versiune2();
    }

	//constructor privat
    private Singleton_Versiune2() { }
}
