package ro.ase.csie.cts.g1067.seminar.update5;

public class DepMarketing implements Marketing{

	@Override
	public float calculeazaDiscountClient(int vechimeAniClient) {
		if (vechimeAniClient > ConstanteVanzari.MINIM_VECHIME)
			return (float) ConstanteVanzari.DISCOUNT_MAXIM / 100;
		else
			return (float) vechimeAniClient / 100;
	}

}
