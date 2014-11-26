package result;

import result.Result.ResultType;
import commands.Commands;

public class InterfaceCommandResult extends Result {

	InterfaceCommandResult()
	{
		this.resultId=generteResultId();				
		this.errorCode=0;
		this.errorString="";		
		this.resultType=ResultType.InterfaceCommandResult;
		
		this.subsequentialCommands.clearAllCommands();
	}
	
	private Commands subsequentialCommands;// the subsequential commands return by executing an interface command.
	
	public Commands getSubsequentialCommands()
	{
		return subsequentialCommands;
		
	}
}
