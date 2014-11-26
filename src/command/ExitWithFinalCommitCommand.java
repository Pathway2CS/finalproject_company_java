package command;

import command.Command.CommandName;
import command.Command.CommandType;

public class ExitWithFinalCommitCommand extends DbCommand {
	
	public ExitWithFinalCommitCommand()
	{
		this.commandId=generteCommandId();
		this.commandId=generteCommandId();
		this.commandType=CommandType.DbCommand;
		this.commandName=CommandName.ExitWithFinalCommit;				
	}

}
