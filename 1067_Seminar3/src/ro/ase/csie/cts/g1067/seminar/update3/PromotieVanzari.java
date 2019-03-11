package ro.ase.csie.cts.g1067.seminar.update3;

public class PromotieVanzari {
	
	
	private float calculeazaDiscountClient(int vechimeAniClient) {
		if (vechimeAniClient > ConstanteVanzari.MINIM_VECHIME)
			return (float) ConstanteVanzari.DISCOUNT_MAXIM / 100;
		else
			return (float) vechimeAniClient / 100;
	}
	
	public float calculeazaPretRedus(TipProdus tipProdus, float pret, int vechimeAniClient) {
		float pretRedus = 0;
		float discountClient = calculeazaDiscountClient(vechimeAniClient);
		
		float pretCuDiscount = 0;
		
		if (tipProdus == TipProdus.NORMAL) {
			return pret;
		} else if (tipProdus == TipProdus.NOU) {
			pretCuDiscount = pret - (ConstanteVanzari.DISCOUNT_NOU * pret);
		} else if (tipProdus == TipProdus.VECHI) {
			pretCuDiscount = pret - (ConstanteVanzari.DISCOUNT_VECHI * pret);
		} else if (tipProdus == TipProdus.RESIGILAT) {
			pretCuDiscount = pret - (ConstanteVanzari.DISCOUNT_RESIGILAT * pret);
		}
		
		pretRedus = pretCuDiscount *(1 - discountClient);
		return pretRedus;
	}
}
