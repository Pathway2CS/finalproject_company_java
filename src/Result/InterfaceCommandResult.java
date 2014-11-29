package Result;

import Commands.Commands;
import Result.Result.ResultType;

public class InterfaceCommandResult extends Result {

	public InterfaceCommandResult()
	{
		this.resultId=generteResultId();				
		this.errorCode=0;
		this.errorString="";		
		this.resultType=ResultType.InterfaceCommandResult;
	}
	
	public InterfaceCommandResult(Commands subsequentialCommands)
	{
		this.resultId=generteResultId();				
		this.errorCode=0;
		this.errorString="";		
		this.resultType=ResultType.InterfaceCommandResult;
		this.subsequentialCommands=subsequentialCommands;
	}
	
	private Commands subsequentialCommands;// the subsequential commands return by executing an interface command.
	
	
	public Commands getSubsequentialCommands()
	{
		return subsequentialCommands;
		
	}
}
