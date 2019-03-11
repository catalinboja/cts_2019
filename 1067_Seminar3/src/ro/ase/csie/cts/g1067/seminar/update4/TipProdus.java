package ro.ase.csie.cts.g1067.seminar.update4;

public enum TipProdus {
	NORMAL(1, ConstanteVanzari.DISCOUNT_NORMAL),
	NOU(2, ConstanteVanzari.DISCOUNT_NOU),
	VECHI(3, ConstanteVanzari.DISCOUNT_VECHI),
	RESIGILAT(4, ConstanteVanzari.DISCOUNT_RESIGILAT);
	
	int id;
	float discount;
	
	int getId() {
		return this.id;
	}
	
	private TipProdus(int Id, float discount) {
		this.id = Id;
		this.discount = discount;
	}
	
	public float calculeazaPretDiscount(float pret) {
		return pret - (this.discount * pret);
	}
}
