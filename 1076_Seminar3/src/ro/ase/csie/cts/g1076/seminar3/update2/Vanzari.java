package ro.ase.csie.cts.g1076.seminar3.update2;

public class Vanzari{
	public float calculeazaPretCuReducere(TipProdus tipProdus, float pret, int vechimeClientInAni) {
		float pretRedus = 0;
		float reducereClient = (vechimeClientInAni > ConstanteDiscount.VECHIME_MINIMA_ANI) ? (float) ConstanteDiscount.REDUCERE_CLIENT_VECHI / 100 : (float) vechimeClientInAni / 100;
		if (tipProdus == TipProdus.PRODUS_NORMAL) {
			pretRedus = pret;
		} else if (tipProdus == TipProdus.PRODUS_NOU) {
			pretRedus = (pret - (ConstanteDiscount.REDUCERE_PRODUS_NOU * pret)) - reducereClient * (pret - (ConstanteDiscount.REDUCERE_PRODUS_NOU * pret));
		} else if (tipProdus == TipProdus.PRODUS_VECHI) {
			pretRedus = (pret - (ConstanteDiscount.REDUCERE_PRODUS_VECHI * pret)) - reducereClient * (pret - (ConstanteDiscount.REDUCERE_PRODUS_VECHI * pret));
		} else if (tipProdus == TipProdus.PRODUS_RESIGILAT) {
			pretRedus = (pret - (ConstanteDiscount.REDUCERE_PRODUS_RESIGILAT * pret)) - reducereClient * (pret - (ConstanteDiscount.REDUCERE_PRODUS_RESIGILAT * pret));
		}
		return pretRedus;
	}
}
