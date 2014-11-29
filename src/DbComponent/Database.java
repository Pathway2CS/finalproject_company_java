package DbComponent;



import Command.Command;
import Command.DbCommand;
import Command.StartInterfaceCommand;
import Command.Command.CommandType;
import CommandGenerator.CommandGenerator;
import Commands.CommandQueue;
import Commands.Commands;
import Result.Result;

public class Database extends DbComponent {
	
	private DbInterface dBInterface;
	private QueryExecutor queryExecutor;
	private RandomDataGenerator randomDataGenerator;
	
	private Commands commands;
	
	Database(String dataFileName)
	{
		this.componentId=generteComponentId();
		this.queryExecutor=new QueryExecutor(dataFileName);
		this.randomDataGenerator=new RandomDataGenerator();
		this.commands = new CommandQueue();
	}

	// error strings
    public static String unexpectedError=   "UNEXEPECT ERROR HAPPEND. DATABASE WILL EXIT NOW";
    public static String noResults=         "NO RESULTS FOUND";
	
	public Result executeCommand(Command command)
	{
		return null;
		
	}
	
	public DbComponent dispatchCommand(Command command)
	{
		switch (command.getCommandType())
		{
		case InterfaceCommand:
			return this.queryExecutor;
		case QueryExecutorCommand:
		    return this.queryExecutor;
		case RandomDataGeneratorCommand:
			return this.randomDataGenerator;
		case DbCommand:		    
		default:  
			return this;
		}
	}
	
	public boolean handleCommandExecutionResults(Result result)
	{
		return true;
		
	}
	
	
	public void run()
	{
		Command firstCommand=CommandGenerator.generateStartInterfaceCommand();
		commands.appendCommand(firstCommand);
		dBInterface.executeCommand(firstCommand);
		
		while (this.commands.empty()!=true)
		{
			Command nextCommand=commands.nextCommand();
			DbComponent nextComponent=dispatchCommand(nextCommand);
			
			Result result=nextComponent.executeCommand(nextCommand);
			
			if (handleCommandExecutionResults(result)==false)
			{
				// Unexpected error happened, clear exiting commands, print error info, and exit.
				commands.clearAllCommands();
				
				Command printCommand= CommandGenerator.generatePrintStringImmediatelyCommand(Database.unexpectedError);
				commands.appendCommand(printCommand);
				
				Command exitCommand= CommandGenerator.generateExitWithoutFinalCommitCommand();
				commands.appendCommand(exitCommand);
			}
		}
		
	}

}
