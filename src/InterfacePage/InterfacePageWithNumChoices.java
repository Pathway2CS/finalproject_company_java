package InterfacePage;

import java.util.ArrayList;

import result.InterfaceCommandResult;


public class InterfacePageWithNumChoices extends InterfacePage {

	public void run()
	{
		showPage();
		
	}
	
	private ArrayList<String> preChoiceStrings;
	private ArrayList<String> choiceStrings; 
	private ArrayList<String> postChoiceStrings;       
	
	
    private ArrayList<Long> nextPages; // Ids of all the next pages that may reach from this page 
    private ArrayList<Long> queryExecutorCommands; // Ids of all the next pages that may reach from this page 

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
	
    private InterfaceCommandResult takeNumInput()
    {
    	InterfaceCommandResult
    	
    }
	
}
