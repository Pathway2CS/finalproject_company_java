package commandGenerator;


import java.util.ArrayList;

import Tuple.Employee;
import Tuple.Tuple;
import command.Command;
import command.DisplayTuplesCommand;
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
	
	public static Command generateDisplayEmployeesCommand(ArrayList<Tuple> toBeDisplayTuples)
	{		
		DisplayTuplesCommand displayTuplesCommand= new DisplayTuplesCommand(toBeDisplayTuples); 	
		return displayTuplesCommand;
	}
	
	
	// Generate Query Executor Commands
	
	
	
}
