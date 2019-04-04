package ro.ase.csie.cts.g1067.seminar7.interfete;

import ro.ase.csie.cts.g1067.seminar7.Student;

public interface InterfataExamen {
	
	/*
	 * metoda simuleaza sustinerea unui examen
	 * intoarce o nota de la 1 la 10 daca examenul a fost sustinut 
	 * intoarce -1 daca studentul a fost absent
	 * intoarce 0 pentru situatii exceptionale
	 */
	public int sustineExamen(String curs, Student student);
}
