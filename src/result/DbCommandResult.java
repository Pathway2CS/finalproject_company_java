package result;

import result.Result.ResultType;

public class DbCommandResult extends Result{

	DbCommandResult()
	{
		this.resultId=Result.maxResultId;
		Result.maxResultId++;
		
		this.errorCode=0;
		this.errorString="";		
		this.resultType=ResultType.DbCommandResult;
	}
}
