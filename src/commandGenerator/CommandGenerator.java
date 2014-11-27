package commandGenerator;


import java.util.ArrayList;

import Tuple.Employee;
import Tuple.Tuple;
import command.Command;
import command.DisplayEmployeesCommand;
import command.ExitWithFinalCommitCommand;
import command.ExitWithoutFinalCommitCommand;
import command.PrintStringImmediatelyCommand;
import command.StartInterfaceCommand;
import command.SwithToPageCommand;

public class CommandGenerator {

	// Generate Db Commands
	
	public static Command generateExitWithFinalCommitCommand()
	{		
		ExitWithFinalCommitCommand exitWithFinalCommitCommand= new ExitWithFinalCommitCommand(); 	
		return exitWithFinalCommitCommand;
	}
	
	public static Command generateExitWithoutFinalCommitCommand()
	{		
		ExitWithoutFinalCommitCommand exitWithoutFinalCommitCommand= new ExitWithoutFinalCommitCommand(); 	
		return exitWithoutFinalCommitCommand;
	}
	
	
	// Generate Interface Commands
	
	public static Command generatePrintStringImmediatelyCommand(String toBePrintString)
	{
		PrintStringImmediatelyCommand printStringImmediatelyCommand= new PrintStringImmediatelyCommand(toBePrintString); 	
		return printStringImmediatelyCommand;
	}
	
	
	public static Command generateStartInterfaceCommand()
	{
		StartInterfaceCommand startInterfaceCommand= new StartInterfaceCommand(); 	
		return startInterfaceCommand;
	}
	
	public static Command generateSwitchToPageCommandById(long switchToPageId)
	{
		SwithToPageCommand 	swithToPageCommand= new SwithToPageCommand(switchToPageId); 	
		return swithToPageCommand;
	}
	
	public static Command generateSwitchToPageCommandByUserInput()
	{		
		return null;
	}
	
	public static Command generateDisplayEmployeesCommand(ArrayList<Employee> toBeDisplayEmployees)
	{		
		DisplayEmployeesCommand displayTuplesCommand= new DisplayEmployeesCommand(toBeDisplayEmployees); 	
		return displayTuplesCommand;
	}
	
	
	// Generate Query Executor Commands
	// Jeff:
	public static Command generateAddEmployeeCommandByUserInput()
	{			
		return null;
	}
	
	public static Command generateDeleteEmployeeByIdCommandByUserInput()
	{			
		return null;
	}
	
	public static Command generateDeleteEmployeeByIdCommandByUserInput()
	{			
		return null;
	}
	
	
	// Generate Random Data Generator Command
	
}
