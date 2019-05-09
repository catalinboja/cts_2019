package ro.ase.csie.cts.g1067.seminar10.adapter;

public class CaracterJoc {
	String numeErou;
	public int puncte;
	
	public CaracterJoc(String numeErou, int puncte) {
		super();
		this.numeErou = numeErou;
		this.puncte = puncte;
	}
	
	public void atacaInamic(
			String caracter, String arma, int puncteAtac) {
		System.out.println(this.numeErou + " -> " 
			+ caracter + " -- " + arma);
	}
	
	public void seApara() {
		this.puncte -= 10;
	}

}
