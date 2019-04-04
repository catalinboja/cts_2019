package ro.ase.csie.cts.curs7.clase;
import ro.ase.csie.cts.curs7.exceptii.ExceptieBD;
import ro.ase.csie.cts.curs7.exceptii.ExceptieConstructor;
import ro.ase.csie.cts.curs7.exceptii.ExceptieMatematica;
import ro.ase.csie.cts.curs7.exceptii.ExceptieSortare;
import ro.ase.csie.cts.curs7.interfete.InterfataBazaDeDate;

public class ColectieDate {
	public int[] valori;
	
	public ColectieDate() {
		this.valori = null;
	}

	public ColectieDate(int[] values) throws ExceptieConstructor{
		if(values == null)
			throw new ExceptieConstructor();
		this.valori = values;
	}

	public int[] getValues() {
		return valori;
	}

	public void setValues(int[] values) {
		this.valori = values.clone();
	}
	
	public float medie() throws ExceptieMatematica{
		int sum = 0;
		for(int value : valori) {
			if(Integer.MAX_VALUE - sum < value)
				throw new ExceptieMatematica();
			sum += value;
		}
		return (float)sum/this.valori.length;
	}
	
	public void sortare() throws ExceptieSortare{
		
		if(this.valori.length == 0 || this.valori.length == 1)
			throw new ExceptieSortare();
		
		boolean nuEsteSortat = true;
		while(nuEsteSortat) {
			nuEsteSortat = false;
			for(int i=0;i<valori.length-1;i++)
				if(valori[i] > valori[i+1] )
				{
					nuEsteSortat = true;
					int temp = valori[i];
					valori[i] = valori[i+1];
					valori[i+1] = temp;
				}
		}
	}
	
	public int salvareBD(InterfataBazaDeDate conexiuneBD)
	throws ExceptieBD{
		int nrInregistrariNoi = conexiuneBD.salvareDate(this.getValues());
		if(nrInregistrariNoi == -1)
			throw new ExceptieBD();
		return nrInregistrariNoi;
	}
	
}
