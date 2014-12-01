package Result;

public abstract class Result {

	public static long maxResultId=0;
	public long resultId;
	
	protected long generteResultId()
	{
		long Id=maxResultId;
		maxResultId++;	
		return Id;
	}
	
	protected int errorCode;
	
	
	/* Please register your new error code here
	 * 
	 * 0: Success, no error
	 * 1: wrong command type
	 * ...
	 *
	 *
	 */
	
	protected String errorString;
	
	protected ResultType resultType;
	
	public enum ResultType {
		DbCommandResult,
	    InterfaceCommandResult, 
	    QueryExecutorCommandResult	    
	}
	
	public ResultType getresultType()
	{
		return resultType;		
	}

	public void setError(int code, String msg) {
		this.errorCode = code;
		this.errorString = msg;
	}
	
}
