package Command;

import Command.Command.CommandName;
import Tuple.Employee;

public class UpdateEmployeeByIdCommand extends QueryExecutorCommand{
	private Employee employee;
	private int id;
	
	public UpdateEmployeeByIdCommand(int id, Employee employee) {
		super();
		this.id = id;
		this.employee = employee;
		commandName = CommandName.UpdateEmpployeeById;
	}
	
	Employee getEmployee() {
		return employee;
	}
	int getId() {
		return id;
	}

}
