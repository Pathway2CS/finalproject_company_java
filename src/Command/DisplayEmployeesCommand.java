package Command;

import java.util.ArrayList;

import Command.Command.CommandName;
import Command.Command.CommandType;
import Tuple.Employee;
import Tuple.Tuple;

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
