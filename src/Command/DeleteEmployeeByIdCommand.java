package Command;

public class DeleteEmployeeByIdCommand extends QueryExecutorCommand {
	private int id;
	
	public DeleteEmployeeByIdCommand(int id) {
		super();
		this.id = id;
		commandName = CommandName.DeleteEmployeeById;
	}
	
	public int getId() {
		return id;
	}
}
