package Result;

import Result.Result.ResultType;

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
