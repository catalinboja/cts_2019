package ro.ase.csie.cts.g1076.seminar3.update3;

public enum TipProdus {
	PRODUS_NORMAL(1),
	PRODUS_NOU(2),
	PRODUS_VECHI(3),
	PRODUS_RESIGILAT(4);
	
	private int id;
	
	private TipProdus(int Id) {
		this.id = Id;
	}
	
	public int getId() {
		return this.id;
	}
}
