package command;

import command.Command.CommandName;
import command.Command.CommandType;

public class GenerateRandomEmployeesCommand extends RandomDataGeneratorCommand {
	
    private int numOfEmployeesTobeGenerate;
	
	public GenerateRandomEmployeesCommand(int numOfEmployeesTobeGenerate)
	{
		this.commandId=generteCommandId();
		this.commandType=CommandType.RandomDataGeneratorCommand;
		this.commandName=CommandName.GenerateRandomEmployees;
		this.numOfEmployeesTobeGenerate=numOfEmployeesTobeGenerate;
	}

}
