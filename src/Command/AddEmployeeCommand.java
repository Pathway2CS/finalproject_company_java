package Command;
import Tuple.*;

public class AddEmployeeCommand extends QueryExecutorCommand {

	private Employee employee;
	
	public AddEmployeeCommand(Employee employee) {
		super();
		this.employee = employee;
		commandName = CommandName.AddEmployee;
	}
	
	Employee getEmployee() {
		return employee;
	}
}
