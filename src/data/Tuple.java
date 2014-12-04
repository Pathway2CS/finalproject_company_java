package data;

import schema.Schema;



public abstract class Tuple {
	
	protected static long maxTupleId;
	protected long tupleId;
	
	
	public Schema schema;
	public abstract void displayTuple();

}
