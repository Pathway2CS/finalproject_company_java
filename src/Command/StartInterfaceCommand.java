package Command;

import Command.Command.CommandName;
import Command.Command.CommandType;

public class StartInterfaceCommand extends InterfaceCommand {
	
	public StartInterfaceCommand()
	{
		this.commandId=generteCommandId();
		this.commandType=CommandType.InterfaceCommand;
		this.commandName=CommandName.StartInterface;				
	}

}
