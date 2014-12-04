package interfacePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import command.*;
import commandgenerator.*;
import commands.*;
import result.*;


public class InterfacePageWithNumChoices extends InterfacePage {

	
	InterfacePageWithNumChoices(long interfacePageId)
	{
		this.interfacePageId=interfacePageId;
		
	   /*
		*
		* This is the definition of the first page, with page Id equal to 1.
		*
		*/
		if (interfacePageId==1)
		{
			preChoiceStrings.add("Welcome to Mini Employee Record Database");
			preChoiceStrings.add("You can:");
			
			
			choiceStrings.add("1: Generate random records");
			choiceStrings.add("2: Add an employee");
			choiceStrings.add("3: Delete an employee");
			choiceStrings.add("4: Update employee info");
			choiceStrings.add("5: Show employees");
			choiceStrings.add("6: Raise salary for all employees");
			choiceStrings.add("7: Exit");
			
			queryExecutorCommands=new HashMap<Integer, Command.CommandName>();
			
			// next page for 1: generate random records
			nextPages.add((long)1);
			// non interface command for 1: generate random records		
			queryExecutorCommands.put(1, Command.CommandName.GenerateRandomEmployees);
			
			// next page for 2: add an employee
			nextPages.add((long)1);
			// non interface command for 2: add an employee ;
            queryExecutorCommands.put(2, Command.CommandName.AddEmployee);
			
			// next page for 3: delete an employee
			nextPages.add((long)1);
		    // non interface command for 3: delete an employee ;
            queryExecutorCommands.put(3, Command.CommandName.DeleteEmployeeById);
			
			// next page for 4: update employee info
			nextPages.add((long)1);
			// non interface command for 3: delete an employee ;
            queryExecutorCommands.put(4, Command.CommandName.UpdateEmpployeeById);
			
			// next page for 5: show employees
			nextPages.add((long)2);
			// no non-interface command corresponding to this choice
			
			// next page for 6: raise salary for all employees
			nextPages.add((long)1);
			// non-interface command for 6: raise salary for all employees
			queryExecutorCommands.put(6, Command.CommandName.RaiseSalaryForAllEmployees);
			
			// next page for 7: Exit
			nextPages.add((long)1);
			// non-interface command for 6: raise salary for all employees
			queryExecutorCommands.put(6, Command.CommandName.ExitWithFinalCommit);
			
		}
		else if (interfacePageId==2)
		{
		 /*
		  *
		  * This is the definition of the show employee page, with page Id equal to 1.
		  *
		  */
			
			choiceStrings.add("1: Show employee by ID");
			choiceStrings.add("2: Show employee by salary range");
			choiceStrings.add("3: Back to main menu");
			
			queryExecutorCommands=new HashMap<Integer, Command.CommandName>();
			
			// next page for 1: show employee by ID
			nextPages.add((long)2);
			// non interface command for  1: show employee by ID	
			queryExecutorCommands.put(1, Command.CommandName.SearchEmployeeById);
			
			// next page for 2: add an employee
			nextPages.add((long)2);
			// non interface command for 2: add an employee ;
            queryExecutorCommands.put(2, Command.CommandName.SearchEmployeesBySalaryRange);
			
			// next page for 3:
			nextPages.add((long)1);
		    // no non interface command for 3: delete an employee ;
 			
		}
	}
	
	
	public Commands run()
	{
		CommandQueue returnedCommands= new CommandQueue();
		
		showPage();
		int userInput=takeNumInput();
		Command nextNonInterfaceCommand=generateNonInterfaceCommand(userInput);
		
		if  (nextNonInterfaceCommand!=null)
		  returnedCommands.appendCommand(nextNonInterfaceCommand);
	
		returnedCommands.appendCommand(generateSwitchToPageCommand(getNextPageIndex(userInput)));
		
		return returnedCommands;
	}
	
	private ArrayList<String> preChoiceStrings;
	private ArrayList<String> choiceStrings; 
	private ArrayList<String> postChoiceStrings;       
	
	
    private ArrayList<Long> nextPages; // Ids of all the next pages that may reach from this page 
    
    private Map <Integer, Command.CommandName> queryExecutorCommands;
    
    
    private int getMaxNumChoice()
    {
    	return nextPages.size();    	
    }
    
    private Long getNextPageIndex(int numChoice)
    {
    	return nextPages.get(numChoice);    	
    }
    
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
    	
    	Scanner in = new Scanner(System.in);
    	int num = in.nextInt();
    	
    	while (num<1||num>getMaxNumChoice())
    	{
    		System.out.println("Invalid Choice. Please input a number shown in the menu above.");
    		num = in.nextInt();
    	} 
    	
    	in.close();
    	
    	return num;
    	
    }
    
    private Command generateNonInterfaceCommand(int userInput)
    {
    	if (queryExecutorCommands.size()==0||queryExecutorCommands.containsKey(userInput)==false)
    		return null;
    	else
    	{
    		switch (queryExecutorCommands.get(userInput-1))
    		{
    		case SearchEmployeeById:
    			return CommandGenerator.generateSearchEmployeeByIdCommandByUserInput();
    			
    		case  SearchEmployeesBySalaryRange:
    			return CommandGenerator.generateSearchEmployeesBySalaryRangeByUserInput();
    			
    		case AddEmployee:
    			return CommandGenerator.generateAddEmployeeCommandByUserInput();
    		
    		case DeleteEmployeeById:
    			return CommandGenerator.generateDeleteEmployeeByIdCommandByUserInput();
    			
    		case UpdateEmpployeeById:
    			return CommandGenerator.generateUpdateEmployeeByIdCommandByUserInput();
    			
    		case RaiseSalaryForAllEmployees:
    			return CommandGenerator.generateRaiseSalaryForAllEmployeesCommandByUserInput();
    		
    		case GenerateRandomEmployees:
    			return CommandGenerator.generateGenerateRandomEmployeesCommandByUserInput();
    			
    		case ExitWithFinalCommit:
    			return CommandGenerator.generateExitWithFinalCommitCommand();
    		
    		default:
    		    return null;		
    		}    		    		
    	}
    }
    
    private Command generateSwitchToPageCommand(long userInput)
    {
    	return CommandGenerator.generateSwitchToPageCommandById(userInput);
    	
    }
	
}
