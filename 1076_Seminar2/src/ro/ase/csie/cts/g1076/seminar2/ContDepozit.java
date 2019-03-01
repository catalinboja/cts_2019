package ro.ase.csie.cts.g1076.seminar2;

import ro.ase.csie.cts.g1076.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1076.seminar2.exceptii.ExceptieTransferIlegal;

public class ContDepozit extends ContBancar{

	public static final double  MIN_DEPOZIT = 100;
	
	public ContDepozit(String iban) {
		super(iban);
		this.balanta = MIN_DEPOZIT;
	}

	@Override
	public void depune(double valoare) throws ExceptieTransferIlegal {
		// TODO Auto-generated method stub
		if(valoare <= 0)
			throw new ExceptieTransferIlegal();
		this.balanta += valoare;
	}

	@Override
	public void extrage(double valoare) throws ExceptieFonduriInsuficiente {
		if(this.balanta - valoare < MIN_DEPOZIT)
			throw new ExceptieFonduriInsuficiente();
		this.balanta -= valoare;
	}

	@Override
	public void transfer(Cont destinatie, double valoare) throws ExceptieTransferIlegal, ExceptieFonduriInsuficiente {
		if(this == destinatie)
			throw new ExceptieTransferIlegal();
		this.extrage(valoare);
		destinatie.depune(valoare);
	}

}
