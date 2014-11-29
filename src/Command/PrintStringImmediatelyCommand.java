package Command;

import Command.Command.CommandName;
import Command.Command.CommandType;

public class PrintStringImmediatelyCommand extends InterfaceCommand {
	
	private String toBePrintString;
	
	public PrintStringImmediatelyCommand(String toBePrintString)
	{
		this.commandId=generteCommandId();
		this.commandType=CommandType.InterfaceCommand;
		this.commandName=CommandName.PrintStringImmediately;
		this.toBePrintString=toBePrintString;
	}
	

}
