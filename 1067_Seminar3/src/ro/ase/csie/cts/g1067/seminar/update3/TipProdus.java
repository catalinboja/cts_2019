package ro.ase.csie.cts.g1067.seminar.update3;

public enum TipProdus {
	NORMAL(1),
	NOU(2),
	VECHI(3),
	RESIGILAT(4);
	
	int id;
	int getId() {
		return this.id;
	}
	
	private TipProdus(int Id) {
		this.id = Id;
	}
}
