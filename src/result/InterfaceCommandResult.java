package result;

import result.Result.ResultType;
import commands.Commands;

public class InterfaceCommandResult extends Result {

	InterfaceCommandResult()
	{
		this.resultId=Result.maxResultId;
		Result.maxResultId++;
		
		this.errorCode=0;
		this.errorString="";		
		this.resultType=ResultType.InterfaceCommandResult;
		
		this.subsequentialCommands.clearAllCommands();
	}
	
	public Commands subsequentialCommands;// the subsequential commands return by executing an interface command.
}
