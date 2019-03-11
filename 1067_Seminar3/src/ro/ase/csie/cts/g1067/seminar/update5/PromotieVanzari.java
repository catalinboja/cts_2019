package ro.ase.csie.cts.g1067.seminar.update5;

public class PromotieVanzari {
	
	Marketing depMarketing;
	
	private float calculeazaDiscountClient(int vechimeAniClient) {
		return depMarketing.calculeazaDiscountClient(vechimeAniClient);
	}
	
	public float calculeazaPretRedus(TipProdus tipProdus, float pret, int vechimeAniClient) {

		float discountClient = calculeazaDiscountClient(vechimeAniClient);
			
		if (tipProdus == TipProdus.NORMAL) {
			return pret;
		} else 
			return tipProdus.calculeazaPretDiscount(pret) *(1 - discountClient);
		
	}
}
