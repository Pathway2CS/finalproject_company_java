package DbComponent;

import java.util.ArrayList;

import Command.Command;
import Command.DisplayEmployeesCommand;
import Command.SwithToPageCommand;
import Commands.Commands;
import InterfacePage.InterfacePage;
import Result.InterfaceCommandResult;
import Result.Result;

public class DbInterface extends DbComponent {
	
	
	public DbInterface()
	{
		
		
	}

	private InterfacePage firstInterfacePage;
	private InterfacePage currentInterfacePage;
	private ArrayList<InterfacePage> interfacePages;
	
	private InterfacePage getInterfacePageById(long interfaceId)
	{
		for (int i=0; i<interfacePages.size();i++)
		{
			if (interfacePages.get(i).interfacePageId==interfaceId)
				return interfacePages.get(i);			
		}
		
		return null; // NF
		
	}
	
	public Result executeCommand(Command command)
	{
		Commands subsequentialCommands;
		InterfaceCommandResult result;
		
		switch (command.getCommandName())
		{
		case StartInterface:
			subsequentialCommands=currentInterfacePage.run();

			result= new InterfaceCommandResult(subsequentialCommands);
			break;
		
		case SwitchToPage:
			SwithToPageCommand switchCommand= (SwithToPageCommand)command;
			InterfacePage nextInterfacePage= getInterfacePageById(switchCommand.getSwitchToPageId());
			currentInterfacePage=nextInterfacePage;

			subsequentialCommands=currentInterfacePage.run();

			result= new InterfaceCommandResult(subsequentialCommands);
			break;
		
		
		case DisplayEmployees:		
			DisplayEmployeesCommand displayEmployeesCommand= (DisplayEmployeesCommand)command;
			
			if (displayEmployeesCommand.getToBeDisplayEmployees().size()==0)
			   System.out.println(Database.noResults);
			else		
			{
			   for (int i=0;i<displayEmployeesCommand.getToBeDisplayEmployees().size();i++)
			   {
				   if (i==0)
					   displayEmployeesCommand.getToBeDisplayEmployees().get(i).schema.displaySchema();
				   
					   displayEmployeesCommand.getToBeDisplayEmployees().get(i).displayTuple();			
			   }
			}
			
			result= new InterfaceCommandResult();
			break;
			
		 case PrintStringImmediately:
			 System.out.println(Database.noResults);
			 result= new InterfaceCommandResult();
			 break;
	     default:
	    	 result=new InterfaceCommandResult();
		}
		
		return result; 
		
		
	}
}
