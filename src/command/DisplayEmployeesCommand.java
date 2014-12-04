package command;

import java.util.ArrayList;

import command.Command.CommandName;
import command.Command.CommandType;

import data.Employee;
import data.Tuple;

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
