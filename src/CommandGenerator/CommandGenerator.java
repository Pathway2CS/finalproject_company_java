package CommandGenerator;


import java.util.ArrayList;

import Command.Command;
import Command.DisplayEmployeesCommand;
import Command.ExitWithFinalCommitCommand;
import Command.ExitWithoutFinalCommitCommand;
import Command.PrintStringImmediatelyCommand;
import Command.StartInterfaceCommand;
import Command.SwithToPageCommand;
import Tuple.Employee;
import Tuple.Tuple;

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
	
	public static Command generateSearchEmployeeByIdCommandByUserInput()
	{			
		return null;
	}
	
	public static Command generateSearchEmployeesBySalaryRangeByUserInput()
	{			
		return null;
	}
	
	public static Command generateAddEmployeeCommandByUserInput()
	{			
		return null;
	}
	
	public static Command generateDeleteEmployeeByIdCommandByUserInput()
	{			
		return null;
	}
	
	public static Command generateUpdateEmployeeByIdCommandByUserInput()
	{			
		return null;
	}
	
	public static Command generateRaiseSalaryForAllEmployeesCommandByUserInput()
	{			
		return null;
	}
	
	
	
	
	// Generate Random Data Generator Command
	
}
