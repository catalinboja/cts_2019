package ro.ase.csie.cts.g1076.seminar3.update3;

public class Vanzari{
	
	private float calculeazaReducereClient(int vechimeClientInAni) {
		if (vechimeClientInAni > ConstanteDiscount.VECHIME_MINIMA_ANI)
			 return (float) ConstanteDiscount.REDUCERE_CLIENT_VECHI / 100;
		else
			return (float) vechimeClientInAni / 100;
	}
	
	private float calculeazaPretRedus(float pret, float procentReducere) {
		return pret * (1 - procentReducere);
	}
	
	
	public float calculeazaPretCuReducere(TipProdus tipProdus, float pret, int vechimeClientInAni) {
		float pretRedus = 0;
		float reducereClient = calculeazaReducereClient(vechimeClientInAni);
		
		if (tipProdus == TipProdus.PRODUS_NORMAL) {
			pretRedus = pret;
		} else if (tipProdus == TipProdus.PRODUS_NOU) {
			pretRedus = calculeazaPretRedus(pret, ConstanteDiscount.REDUCERE_PRODUS_NOU)*(1- reducereClient);
		} else if (tipProdus == TipProdus.PRODUS_VECHI) {
			pretRedus = calculeazaPretRedus(pret, ConstanteDiscount.REDUCERE_PRODUS_VECHI)*(1- reducereClient);
		} else if (tipProdus == TipProdus.PRODUS_RESIGILAT) {
			pretRedus = calculeazaPretRedus(pret, ConstanteDiscount.REDUCERE_PRODUS_RESIGILAT)*(1- reducereClient);
		}
		return pretRedus;
	}
}
