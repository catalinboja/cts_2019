package ro.ase.csie.cts.g1076.seminar2;

import ro.ase.csie.cts.g1076.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1076.seminar2.exceptii.ExceptieTransferIlegal;

public class ContCredit extends ContBancar{

	public static final double MAX_CREDIT = 5000;
	public static final double PROCENT_LIMITA_ALERT_FISC = 10;
	
	public ContCredit(String iban) {
		super(iban);
		this.balanta = ContCredit.MAX_CREDIT;
	}

	@Override
	public void depune(double valoare) throws ExceptieTransferIlegal {
		this.balanta += valoare;
		if(valoare > PROCENT_LIMITA_ALERT_FISC/100*MAX_CREDIT)
			throw new ExceptieTransferIlegal();
	}

	@Override
	public void extrage(double valoare) throws ExceptieFonduriInsuficiente {
		if(this.balanta-valoare < 0)
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
