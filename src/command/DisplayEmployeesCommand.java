package command;

import java.util.ArrayList;

import Tuple.Employee;
import Tuple.Tuple;
import command.Command.CommandName;
import command.Command.CommandType;

public class DisplayEmployeesCommand extends InterfaceCommand {
	
	 private ArrayList<Employee> toBeDisplayEmployees;
		
		public DisplayEmployeesCommand(ArrayList<Employee> toBeDisplayEmployees)
		{
			this.commandId=generteCommandId();
			this.commandType=CommandType.InterfaceCommand;
			this.commandName=CommandName.DisplayEmployees;		
			this.toBeDisplayEmployees=toBeDisplayEmployees;		
		}
		
		public ArrayList<Employee> getToBeDisplayEmployees()
		{
			return toBeDisplayEmployees;		
		}

}
