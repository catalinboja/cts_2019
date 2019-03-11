package ro.ase.csie.cts.g1067.seminar.update2;

public class PromotieVanzari {
	public float calculeazaPretRedus(TipProdus tipProdus, float pret, int vechimeAniClient) {
		float pretRedus = 0;
		float discountClient = (vechimeAniClient > ConstanteVanzari.MINIM_VECHIME) ? (float) ConstanteVanzari.DISCOUNT_MAXIM / 100 : (float) vechimeAniClient / 100;
		if (tipProdus == TipProdus.NORMAL) {
			pretRedus = pret;
		} else if (tipProdus == TipProdus.NOU) {
			pretRedus = (pret - (ConstanteVanzari.DISCOUNT_NOU * pret)) - discountClient * (pret - (ConstanteVanzari.DISCOUNT_NOU * pret));
		} else if (tipProdus == TipProdus.VECHI) {
			pretRedus = (pret - (ConstanteVanzari.DISCOUNT_VECHI * pret)) - discountClient * (pret - (ConstanteVanzari.DISCOUNT_VECHI * pret));
		} else if (tipProdus == TipProdus.RESIGILAT) {
			pretRedus = (pret - (ConstanteVanzari.DISCOUNT_RESIGILAT * pret)) - discountClient * (pret - (ConstanteVanzari.DISCOUNT_RESIGILAT * pret));
		}
		return pretRedus;
	}
}
