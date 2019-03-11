package ro.ase.csie.cts.g1076.lab3.update2;

public enum ProductTypes {
	NORMAL(1),
	NEW(2),
	OLD(3),
	REFURBISHED(4);
	
	private int id;
	
	public int getId() {
		return this.id;
	}
	
	private ProductTypes(int id) {
		this.id = id;
	}
	
}
