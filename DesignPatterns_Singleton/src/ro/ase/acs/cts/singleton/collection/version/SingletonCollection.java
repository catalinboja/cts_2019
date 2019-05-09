package ro.ase.acs.cts.singleton.collection.version;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

public class SingletonCollection {
	
	//colectie de referinte catre obiectele Singleton
	private static HashMap<String,LoggerInterface> hashMap = new HashMap<String, LoggerInterface>();
	
	//referinta publica statica la colectie
	public static SingletonCollection LoggerCollection = new SingletonCollection();
	
	//constructor privat pentru a bloca crearea altor colectii
	private SingletonCollection(){
		
	}
	
	public static synchronized LoggerInterface getInstance(String className){
		//cautare referinta in map dupa tip
		LoggerInterface instance = (LoggerInterface)hashMap.get(className);
		if(instance == null){
			try {
				//referinta NU exista - se construieste un obiect
				instance = (LoggerInterface)Class.forName(className).newInstance();
				//referinta este salvata in map
				hashMap.put(className, instance);
				
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return instance;
	}
}

//manager fisier log-uri 
class LoggerFisier implements LoggerInterface{

	//constructor default - vizibil doar in pachetul curent
	LoggerFisier(){}
	
	//supradefinire metoda definita in interfata Logger
	@Override
	public synchronized void printLog(String msg) {
		
		File file = new File("logs.txt");
		PrintWriter writer;
		
		try {
			writer = new PrintWriter(file);
			writer.println(msg);
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//manager log-uri afisate la consola
class LoggerConsola implements LoggerInterface{

	LoggerConsola() {
	} 
	
	@Override
	public void printLog(String msg) {
		System.out.println("Afisare mesaj la consola:"+msg);
	}

}

