package ro.ase.csie.cts.g1067.seminar.update1;

public class PromotieVanzari {
	public float calculeazaPretRedus(int tipProdus, float pret, int vechimeAniClient) {
		float pretRedus = 0;
		float discountClient = (vechimeAniClient > 10) ? (float) 15 / 100 : (float) vechimeAniClient / 100;
		if (tipProdus == 1) {
			pretRedus = pret;
		} else if (tipProdus == 2) {
			pretRedus = (pret - (0.1f * pret)) - discountClient * (pret - (0.1f * pret));
		} else if (tipProdus == 3) {
			pretRedus = (pret - (0.25f * pret)) - discountClient * (pret - (0.25f * pret));
		} else if (tipProdus == 4) {
			pretRedus = (pret - (0.35f * pret)) - discountClient * (pret - (0.35f * pret));
		}
		return pretRedus;
	}
}
