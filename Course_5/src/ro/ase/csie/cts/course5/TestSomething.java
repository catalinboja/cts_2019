package ro.ase.csie.cts.course5;

import ro.ase.csie.cts.course5.exceptions.OverflowException;

public class TestSomething {

	public static int add(Integer a, Integer b) throws OverflowException {
		
		if(Integer.MAX_VALUE - a < b)
			throw new OverflowException();
		return a + b;
	}
	
	
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int[] emptyArray = new int[] {};
		int result=0;
		try {
			result = add(Integer.MAX_VALUE,1);
		} catch (OverflowException e) {
			System.out.println("Overflow");
		}
		System.out.println("The result is "+result);
		
		Student s = new Student();
		int[] grades = new int[] {9,9,10};
		s.setGrades(grades);
		
		//print s grades -> 9,9,10
		
		grades[0] = 4;
		
		//print s grades -> 4,9,10
		
		long end = System.currentTimeMillis();
		
		System.out.println("Performance: "+(end-start));
		
	}

}
