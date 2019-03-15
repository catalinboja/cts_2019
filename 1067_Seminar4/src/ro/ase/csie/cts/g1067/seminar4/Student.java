package ro.ase.csie.cts.g1067.seminar4;

import java.util.ArrayList;

import ro.ase.csie.cts.g1067.seminar4.exceptii.ExceptieStudent;

public class Student {
	public String nume;
	public ArrayList<Integer> note;
	
	public Student(String nume, ArrayList<Integer> note) {
		super();
		this.nume = nume;
		if(note!=null)
			this.note = (ArrayList<Integer>)note.clone();
	}

	public void setNote(ArrayList<Integer> note) {
		this.note = (ArrayList<Integer>)note.clone();
	}
	
	public float calculMedie() throws ExceptieStudent{
		float suma = 0;
		if(this.note == null)
			throw new ExceptieStudent();
		
		for(int nota : this.note)
			suma += nota;
		return suma/this.note.size();
	}
}
