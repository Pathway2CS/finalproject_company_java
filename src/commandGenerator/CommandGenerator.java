package commandGenerator;

import command.Command;
import command.Command.CommandDictionary;
import command.Command.CommandType;
import command.InterfaceCommand;

public class CommandGenerator {

	static Command generateInterfaceCommand(CommandType commandType,CommandDictionary command)
	{
		
		return null;
	}
	
	static InterfaceCommand generateInterfaceCommand(CommandDictionary command)
	{
		switch (command)
		{
		  case SwitchToPage:
			return generateRunInterfaceCommand();
			break;
		  default:
			break;
		}	
		
	    SwitchToPage,
		
	}
	
	static RunInterfaceCommand generateRunInterfaceCommand()
	{
		
		return null;
	}
	
}
