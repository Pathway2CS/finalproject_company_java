package command;

import command.Command.CommandName;
import command.Command.CommandType;

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
