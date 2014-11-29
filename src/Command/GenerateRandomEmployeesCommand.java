package Command;

import Command.Command.CommandName;
import Command.Command.CommandType;

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
