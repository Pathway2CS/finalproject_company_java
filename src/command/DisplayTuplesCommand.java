package command;

import java.util.ArrayList;

import Tuple.Employee;
import Tuple.Tuple;
import command.Command.CommandName;
import command.Command.CommandType;

public class DisplayTuplesCommand extends InterfaceCommand {

    private ArrayList<Tuple> toBeDisplayTuples;
	
	public DisplayTuplesCommand(ArrayList<Tuple> toBeDisplayedTuples)
	{
		this.commandId=generteCommandId();
		this.commandType=CommandType.InterfaceCommand;
		this.commandName=CommandName.DisplayTuples;		
		this.toBeDisplayTuples=toBeDisplayedTuples;		
	}
	
	public ArrayList<Tuple> getToBeDisplayedEmployees()
	{
		return toBeDisplayTuples;		
	}
	
}
