package ro.ase.csie.cts.g1067.seminar7;

import java.util.Arrays;

import ro.ase.csie.cts.g1067.seminar7.exceptii.ExceptieExamen;
import ro.ase.csie.cts.g1067.seminar7.exceptii.ExceptieMatematica;
import ro.ase.csie.cts.g1067.seminar7.exceptii.ExceptieStudent;
import ro.ase.csie.cts.g1067.seminar7.interfete.InterfataExamen;

public class Student {
	int varsta;
	String nume;
	int[] note;
	
	public static final int MIN_VARSTA = 14;
	public static final int MAX_VARSTA = 90;
	
	public Student() {
		note = null;
		nume = "Anonim";
		varsta = 0;
	}
	
	public Student(int varsta, String nume, int[] note) throws ExceptieStudent {
		super();
		this.setVarsta(varsta);
		this.nume = nume;
		this.note = note;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(Integer varsta) throws ExceptieStudent{
		if(varsta < Student.MIN_VARSTA || varsta > Student.MAX_VARSTA)
			throw new ExceptieStudent();
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int[] getNote() {
		return note;
	}

	public void setNote(int[] note) {
		if(note == null)
			this.note = null;
		else
			this.note = note.clone();
	}
	
	public int getNotaMinima() throws ExceptieMatematica{
		if(this.note == null || this.note.length == 0)
			throw new ExceptieMatematica();
		int minim = this.note[0];
		for(int i=1;i<this.note.length;i++)
			if(minim > this.note[i])
				minim = this.note[i];
		return minim;
	}
	
	
	public void adaugaNotaExamen(
			String curs, InterfataExamen examen) throws ExceptieExamen {
		
		int notaExamen = examen.sustineExamen(curs, this);
		
		if(notaExamen == 0)
			throw new ExceptieExamen();
		
		if(notaExamen > 0) {
		int[] newNote = new int[this.getNote().length+1];
		for(int i=0;i<this.getNote().length;i++)
			newNote[i] = this.getNote()[i];
		newNote[this.getNote().length] = notaExamen;
		
		this.setNote(newNote);
		}
		
	}
	
	
	
	
	
	
}