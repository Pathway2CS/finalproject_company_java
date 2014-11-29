package Command;

public class SearchEmployeeByIdCommand extends QueryExecutorCommand {
	private int id;
	
	public SearchEmployeeByIdCommand(int id) {
		super();
		this.id = id;
		commandName =CommandName.SearchEmployeeById; 
	}
	
	public int getId() {
		return id;
	}
}
