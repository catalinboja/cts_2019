package ro.ase.csie.cts.g1076.seminar3.update4;

public enum TipProdus {
	PRODUS_NORMAL(1,ConstanteDiscount.REDUCERE_PRODUS_NORMAL),
	PRODUS_NOU(2, ConstanteDiscount.REDUCERE_PRODUS_NOU),
	PRODUS_VECHI(3, ConstanteDiscount.REDUCERE_PRODUS_VECHI),
	PRODUS_RESIGILAT(4, ConstanteDiscount.REDUCERE_PRODUS_RESIGILAT);
	
	private int id;
	private float discount;
	
	private TipProdus(int Id, float  Discount) {
		this.id = Id;
		this.discount = Discount;
	}
	
	public int getId() {
		return this.id;
	}
	
	public float getPretRedus(float pret) {
		return (1-this.discount)*pret;
	}
}
