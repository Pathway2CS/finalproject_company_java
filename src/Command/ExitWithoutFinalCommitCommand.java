package Command;

import Command.Command.CommandName;
import Command.Command.CommandType;

public class ExitWithoutFinalCommitCommand extends InterfaceCommand {
	
	public ExitWithoutFinalCommitCommand()
	{
		this.commandId=generteCommandId();
		this.commandId=generteCommandId();
		this.commandType=CommandType.DbCommand;
		this.commandName=CommandName.ExitWithoutFinalCommit;				
	}

}
