package ro.ase.csie.cts.g1076.seminar3.update4;

public class Vanzari{
	
	private float calculeazaReducereClient(int vechimeClientInAni) {
		if (vechimeClientInAni > ConstanteDiscount.VECHIME_MINIMA_ANI)
			 return (float) ConstanteDiscount.REDUCERE_CLIENT_VECHI / 100;
		else
			return (float) vechimeClientInAni / 100;
	}
	
	public float calculeazaPretCuReducere(TipProdus tipProdus, 
			float pret, 
			int vechimeClientInAni) {
		float pretRedus = 0;
		float reducereClient = calculeazaReducereClient(vechimeClientInAni);
		
		return tipProdus.getPretRedus(pretRedus)*(1-reducereClient);
	}
}
