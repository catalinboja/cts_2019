package ro.ase.acs.cts.singleton.collection.version;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LoggerFisier2 implements LoggerInterface{

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
