package ro.ase.csie.cts.course7.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.csie.cts.course7.DataCollection;
import ro.ase.csie.cts.course7.MOCKS.MyDbMock;
import ro.ase.csie.cts.course7.exceptions.DBException;
import ro.ase.csie.cts.course7.interfaces.DBInterface;

public class TestCaseMyCollection {

	DataCollection myCollection;
	MyDbMock dbMock;
	
	@Before
	public void setUp() throws Exception {
		myCollection = new DataCollection();
		dbMock = new MyDbMock();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSaveDbRight() throws DBException {
		int[] existingValues = new int[]{1,2,3,4,5};
		int noValues = existingValues.length;
		
		myCollection.setValues(existingValues);
		
		boolean dbOperationSuccess = true;
		dbMock.setExpectedReturnValue(dbOperationSuccess);
		
		int noSavedRecords = myCollection.save2DB(dbMock);
		
		assertEquals(noValues, noSavedRecords);
	}
	
	@Test
	public void testSaveDbRight2() throws DBException {
		int[] existingValues = new int[]{1,2,3,4,5};
		int noValues = existingValues.length;
		
		myCollection.setValues(existingValues);
		
		int noSavedRecords = myCollection.save2DB(new DBInterface() {
			
			@Override
			public boolean saveDB(int[] values) {
				return true;
			}
		});
		
		assertEquals(noValues, noSavedRecords);
	}
	
	@Test(expected = DBException.class)
	public void testSaveDbException() throws DBException {
		int[] existingValues = new int[] {};
		myCollection.setValues(existingValues);
		
		boolean dbOperationFailure = false;
		dbMock.setExpectedReturnValue(dbOperationFailure);
		
		myCollection.save2DB(dbMock);
	}

}
