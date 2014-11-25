package result;

public class Result {

	public static long maxResultId=0;
	public long resultId;
	public int errorCode;
	public String errorString;
	
	public enum ResultType {
		DbCommandResult,
	    InterfaceCommandResult, 
	    QueryExecutorCommandResult	    
	}
	
	public ResultType resultType;
}
