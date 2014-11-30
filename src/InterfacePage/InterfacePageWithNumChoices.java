package InterfacePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import CommandGenerator.*;
import Result.*;
import Commands.*;
import Command.*;


public class InterfacePageWithNumChoices extends InterfacePage {

	
	InterfacePageWithNumChoices(long interfacePageId)
	{
		this.interfacePageId=interfacePageId;
		
		if (interfacePageId==1)
		{
			preChoiceStrings.add("Welcome to Mini Employee Record Database");
			preChoiceStrings.add("You can:");
			
			
			choiceStrings.add("1: generate random records");
			choiceStrings.add("2: add an employee");
			choiceStrings.add("3: delete an employee");
			choiceStrings.add("4: update employee info");
			choiceStrings.add("5: show employees");
			choiceStrings.add("6: raise salary for all employees");
			choiceStrings.add("7: Exit");
			
			// next page for 1: generate random records
			nextPages.add((long)1);
			// next page for 2: add an employee
			nextPages.add((long)1);
			// next page for 3: delete an employee
			nextPages.add((long)1);
			// next page for 4: update employee info
			nextPages.add((long)1);
			// next page for 5: show employees
			nextPages.add((long)2);
			// next page for 6: raise salary for all employees
			nextPages.add((long)1);
			// next page for 7: Exit
			nextPages.add((long)1);
			
			queryExecutorCommands=new HashMap<Integer, Command.CommandName>();
			
			// non interface command for 1: generate random records		
			queryExecutorCommands.put(1, Command.CommandName.GenerateRandomEmployees);
			
			// non interface command for 2: add an employee ;
            queryExecutorCommands.put(2, Command.CommandName.AddEmployee);
            
            
			
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
    			
    		case AddEmployee:
    			return CommandGenerator.generateAddEmployeeCommandByUserInput();
    		
    		case DeleteEmployeeById:
    			return CommandGenerator.generateDeleteEmployeeByIdCommandByUserInput();
    			
    		case UpdateEmpployeeById:
    			return CommandGenerator.generateUpdateEmployeeByIdCommandByUserInput();
    			
    		case RaiseSalaryForAllEmployees:
    			return CommandGenerator.generateRaiseSalaryForAllEmployeesCommandByUserInput();
    		
    		case GenerateRandomEmployees:
    			return CommandGenerator.generateGenerateRandomEmployeeCommand();
    		
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
