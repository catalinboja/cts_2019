package ro.ase.csie.cts.g1067.seminar2;

import ro.ase.csie.cts.g1067.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1067.seminar2.exceptii.ExceptieTransferIlegal;

public class ContCredit extends ContBancar{

	public final static double MAX_CREDIT = 5000;
	
	public ContCredit(String iban) {
		super(iban);
		this.balanta = MAX_CREDIT;
	}

	@Override
	public void depunere(Object suma) throws ExceptieTransferIlegal {
		double valoarePrimita = 0;
		if(suma instanceof Double)
			valoarePrimita = (Double)suma;
		else
			throw new UnsupportedOperationException();
		if(valoarePrimita <= 0)
			throw new ExceptieTransferIlegal();
		
		this.balanta += valoarePrimita;
	}

	@Override
	public void retrage(Object suma) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		double valoare = Util.getDouble(suma);
		if(this.balanta - valoare < 0)
			throw new ExceptieFonduriInsuficiente();
		if(valoare <= 0)
			throw new ExceptieTransferIlegal();
		
		this.balanta -= valoare;
		
	}

	@Override
	public void transfer(Object suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		if(this == destinatie)
			throw new ExceptieTransferIlegal();
		this.retrage(suma);
		destinatie.depunere(suma);
	}

}
