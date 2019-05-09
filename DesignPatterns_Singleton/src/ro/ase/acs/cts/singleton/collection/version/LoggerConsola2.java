package ro.ase.acs.cts.singleton.collection.version;

public class LoggerConsola2 implements LoggerInterface{

	@Override
	public void printLog(String msg) {
		System.out.println("Afisare mesaj la consola:"+msg);
	}

}
