package command;

import command.Command.CommandName;
import command.Command.CommandType;

public class ExitWithoutFinalCommitCommand extends InterfaceCommand {
	
	public ExitWithoutFinalCommitCommand()
	{
		this.commandId=generteCommandId();
		this.commandId=generteCommandId();
		this.commandType=CommandType.DbCommand;
		this.commandName=CommandName.ExitWithoutFinalCommit;				
	}

}
