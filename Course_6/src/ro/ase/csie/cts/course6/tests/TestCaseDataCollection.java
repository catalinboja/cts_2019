package ro.ase.csie.cts.course6.tests;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;
import ro.ase.csie.cts.course6.DataCollection;
import ro.ase.csie.cts.course6.excpetions.ConstructorException;
import ro.ase.csie.cts.course6.excpetions.OverflowException;
import ro.ase.csie.cts.course6.excpetions.SortException;

public class TestCaseDataCollection extends TestCase {

	//test fixture
	DataCollection myCollection;
	
	public TestCaseDataCollection(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		myCollection = new DataCollection();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAverageRight() throws OverflowException {
		int[] values = new int[] {3,3,4};
		myCollection.setValues(values);
		
		float expectedAverage = 3.33f;
		float actualAverage = myCollection.average();
		
		assertEquals(expectedAverage, actualAverage,0.01);
	}
	
	public void testAverageOrder() throws OverflowException {
		int[] values = new int[] {1,2,3};
		myCollection.setValues(values);
		
		float expectedAverage = 2.00f;
		float actualAverage = myCollection.average();
		
		assertEquals(expectedAverage, actualAverage,0.01);
	}
	
	public void testAverageRangeZeroValues() throws OverflowException {
		int[] values = new int[] {0,0,0};
		myCollection.setValues(values);
		
		float expectedAverage = 0.00f;
		float actualAverage = myCollection.average();
		
		assertEquals(expectedAverage, actualAverage,0);
	}
	
	public void testAverageRangeMaxIntValue() {
		int[] values = new int[] {Integer.MAX_VALUE,2,4};
		myCollection.setValues(values);
		try {
			myCollection.average();
			fail("No exceptions");
		}
		catch(OverflowException e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("We got another exception");
		}
		
	}
	
	public void testSortOrder() throws SortException {
		int[] values = new int[] {3,2,1};
		myCollection.setValues(values);
		
		int[] expectedResult = new int[] {1,2,3};
		
		myCollection.sort();
		
		int[] actualResult = myCollection.getValues();
		
		assertArrayEquals(expectedResult, actualResult);
	}
	
	public void testConstructorReference() throws ConstructorException {
		int[] values = new int[] {3,2,1};
		myCollection = new DataCollection(values);
		
		int[] initialValues = myCollection.getValues().clone();
		
		//change external reference
		values[1] = 99;
		
		int[] actualValues = myCollection.getValues();
		
		assertArrayEquals(initialValues, actualValues);
	}
	
	public void testConstructorNullReference() {
		int[] values = null;
		try {
			myCollection = new DataCollection(values);
			fail();
		} catch (ConstructorException e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail();
		}
		
		
	}

	public void testSortZeroElements() {
		int[] values = new int[] {};
		myCollection.setValues(values);
		
		try {
			myCollection.sort();
			fail();
		} catch (SortException e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail();
		}
	}
	
	public void testSortOneElement() {
		int[] values = new int[] {5};
		myCollection.setValues(values);
		
		try {
			myCollection.sort();
			fail("No exception");
		} catch (SortException e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("ANother exception " + e.getMessage());
		}
	}
	
	public void testSortPerfomanceTest() throws SortException {
		int arraySize = (int)1E5;
		int[] values = new int[arraySize];
		for(int i=0;i<arraySize;i++)
			values[i] = arraySize-i;
		
		myCollection.setValues(values);

		long startTime = System.currentTimeMillis();
		myCollection.sort();
		long endTime = System.currentTimeMillis();
		
		long delta = endTime - startTime;
		
		if(delta < 7000)
			assertTrue(true);
		else
			fail("It's too slow: " + delta);
		
	}
	
	public void testSortCrossCheck() throws SortException {
		int arraySize = (int)1E3;
		
		ArrayList<Integer> list = new ArrayList<>();
		int[] values = new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			values[i] = arraySize-i;
			list.add(values[i]);
		}
	
		myCollection.setValues(values);
		
		Collections.sort(list);
		myCollection.sort();
		
		int[] sortedValues = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			sortedValues[i] = list.get(i);
		}
		
		assertArrayEquals(sortedValues, myCollection.getValues());
	}
	
	public void testConstructorInverseRel() {
		myCollection = null;
		int[] correctValues = new int[] {1,2,3};
		
		try {
			myCollection = new DataCollection(correctValues);
			//assertTrue("We didn't got any error",true);
			assertNotNull(myCollection);
		} catch (Exception e) {
			fail();
		}
	}
}
