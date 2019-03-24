package ro.ase.csie.cts.g1076.seminar5;

import java.util.ArrayList;

import ro.ase.csie.cts.g1076.seminar5.exceptii.ExceptieOperatieMatematica;
import ro.ase.csie.cts.g1076.seminar5.exceptii.ExceptieStudent;

public class Student {
	ArrayList<Integer> note;
	String nume;
	int varsta;
	
	public static final int VARSTA_MINIMA = 14;
	public static final int VARSTA_MAXIMA = 90;
	
	public Student() {
		note = new ArrayList<>();
		nume = "Anonim";
		varsta = 0;
	}

	public Student(ArrayList<Integer> note, String nume, int varsta) {
		super();
		this.note = note;
		this.nume = nume;
		this.varsta = varsta;
	}

	public ArrayList<Integer> getNote() {
		return note;
	}

	public void setNote(ArrayList<Integer> note) {
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws ExceptieStudent{
		if(varsta < Student.VARSTA_MINIMA || varsta > Student.VARSTA_MAXIMA)
			throw new ExceptieStudent();
		this.varsta = varsta;
	}
	
	public int getNotaMinima() throws ExceptieOperatieMatematica{
		if(this.note == null)
			throw new ExceptieOperatieMatematica();
		int minim = this.note.get(0);
		for(int nota : this.note)
			if(minim > nota)
				minim = nota;
		return minim;
	}
	
}
