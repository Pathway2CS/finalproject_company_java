package result;


public class QueryExecutorCommandResult extends Result {

	QueryExecutorCommandResult()
	{
		this.resultId=Result.maxResultId;
		Result.maxResultId++;
		
		this.errorCode=0;
		this.errorString="";		
		this.resultType=ResultType.QueryExecutorCommandResult;
	}
}
