package ro.ase.csie.cts.course7;

import ro.ase.csie.cts.course7.exceptions.ConstructorException;
import ro.ase.csie.cts.course7.exceptions.DBException;
import ro.ase.csie.cts.course7.exceptions.OverflowException;
import ro.ase.csie.cts.course7.exceptions.SortException;
import ro.ase.csie.cts.course7.interfaces.DBInterface;

public class DataCollection {
	public int[] values;
	
	public DataCollection() {
		this.values = null;
	}

	public DataCollection(int[] values) throws ConstructorException{
		super();
		if(values == null)
			throw new ConstructorException();
		this.values = values.clone();
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}
	
	public float average() throws OverflowException{
		int sum = 0;
		for(int value : values) {
			//test for overflow
			if(Integer.MAX_VALUE - sum < value )
				throw new OverflowException();
			sum += value;
		}
		return (float)sum/this.values.length;
	}
	
	public void sort() throws SortException{
		
		if(values.length == 0 || values.length == 1)
			throw new SortException();
		
		boolean isNotSorted = true;
		while(isNotSorted) {
			isNotSorted = false;
			for(int i=0;i<values.length-1;i++)
				if(values[i] > values[i+1] )
				{
					isNotSorted = true;
					int temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
				}
		}
	}
	
	
	public int save2DB(DBInterface dbObject) throws DBException {
		if (dbObject.saveDB(this.getValues())) {
			return this.getValues().length;
		}
		else
			throw new DBException();
		
	}
}
