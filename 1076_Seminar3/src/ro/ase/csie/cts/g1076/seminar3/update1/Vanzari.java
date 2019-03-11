package ro.ase.csie.cts.g1076.seminar3.update1;

public class Vanzari{
	public float calculeazaPretCuReducere(int tipProdus, float pret, int vechimeClientInAni) {
		float pretRedus = 0;
		float reducereClient = (vechimeClientInAni > 10) ? (float) 15 / 100 : (float) vechimeClientInAni / 100;
		if (tipProdus == 1) {
			pretRedus = pret;
		} else if (tipProdus == 2) {
			pretRedus = (pret - (0.1f * pret)) - reducereClient * (pret - (0.1f * pret));
		} else if (tipProdus == 3) {
			pretRedus = (pret - (0.25f * pret)) - reducereClient * (pret - (0.25f * pret));
		} else if (tipProdus == 4) {
			pretRedus = (pret - (0.35f * pret)) - reducereClient * (pret - (0.35f * pret));
		}
		return pretRedus;
	}
}
