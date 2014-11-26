package InterfacePage;

import java.util.ArrayList;

import command.Command;
import command.Command.CommandName;
import commands.CommandQueue;
import commands.Commands;
import result.InterfaceCommandResult;


public class InterfacePageWithNumChoices extends InterfacePage {

	public Commands run()
	{
		CommandQueue returnedCommands= new CommandQueue();
		
		showPage();
		int userInput=takeNumInput();
		returnedCommands.appendCommand(generateQueryExecutorCommand(userInput));
		returnedCommands.appendCommand(generateSwitchToPageCommand(userInput));
		
		return returnedCommands;
	}
	
	private ArrayList<String> preChoiceStrings;
	private ArrayList<String> choiceStrings; 
	private ArrayList<String> postChoiceStrings;       
	
	
    private ArrayList<Long> nextPages; // Ids of all the next pages that may reach from this page 
    private ArrayList<CommandName> queryExecutorCommands; // Ids of all the next pages that may reach from this page 

    private void showPage()
	{
		printPreChoiceStrings();
		printChoiceStrings();
		printPostChoiceStrings();
	}
    
    private void printPreChoiceStrings() // print the part before the command choices. 
    {
       for (int i=0;i<preChoiceStrings.size();i++)
       {
    	   System.out.println(preChoiceStrings.get(i));
       }
    }
	
    private void printChoiceStrings()
	{
       for (int i=0;i<preChoiceStrings.size();i++)
       {
     	   System.out.println(choiceStrings.get(i));
       }		
	}
    private void printPostChoiceStrings()
	{
	   for (int i=0;i<postChoiceStrings.size();i++)
	   {
	       System.out.println(postChoiceStrings.get(i));
	   }				
	}
	
    private int takeNumInput()
    {
    	
    	// take user input here, until valid input is given
    	   	
    	return 0;
    	
    }
    
    private Command generateQueryExecutorCommand(int userInput)
    {
    	if (queryExecutorCommands.size()==0)
    		return null;
    	else
    	{
    		
    		switch (queryExecutorCommands.get(userInput-1))
    		{
    		case SearchEmployeeById:
    			return CommandGenerator.
    		
    		}
    		
    		
    	}
    }
    
    private Command generateSwitchToPageCommand(int userInput)
    {
    	return null;
    	
    }
	
}
