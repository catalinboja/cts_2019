package ro.ase.csie.cts.curs;

public class Student  {
	
	public InterfataContabilitate contabilitate;
	public InterfataProfPOO profPOO;
	public InterfataDB db;
	
	void platesteTaxa(){ contabilitate.platesteTaxa(); }
	void sustineExamenPOO(){ profPOO.sustineExamenPOO(); }
	void salvareBazaDate(){ db.salvareBazaDate(); }
}
