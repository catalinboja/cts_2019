package ro.ase.csie.cts.g1067.seminar.update4;

public class PromotieVanzari {
	
	
	private float calculeazaDiscountClient(int vechimeAniClient) {
		if (vechimeAniClient > ConstanteVanzari.MINIM_VECHIME)
			return (float) ConstanteVanzari.DISCOUNT_MAXIM / 100;
		else
			return (float) vechimeAniClient / 100;
	}
	
	public float calculeazaPretRedus(TipProdus tipProdus, float pret, int vechimeAniClient) {

		float discountClient = calculeazaDiscountClient(vechimeAniClient);
			
		if (tipProdus == TipProdus.NORMAL) {
			return pret;
		} else 
			return tipProdus.calculeazaPretDiscount(pret) *(1 - discountClient);
		
	}
}
