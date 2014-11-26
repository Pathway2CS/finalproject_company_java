package command;

import command.Command.CommandName;
import command.Command.CommandType;

public class StartInterfaceCommand extends InterfaceCommand {
	
	public StartInterfaceCommand()
	{
		this.commandId=generteCommandId();
		this.commandType=CommandType.InterfaceCommand;
		this.commandName=CommandName.StartInterface;				
	}

}
