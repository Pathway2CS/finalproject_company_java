package command;


public abstract class Command {
	
	static long maxCommandId;
	
	public long commandId;
	
	protected CommandType commandType;
	
	protected CommandName commandName;
	
	protected long generteCommandId()
	{
		long Id=maxCommandId;
		maxCommandId++;	
		return Id;
	}
	
	public enum CommandType {
	    InterfaceCommand, 
	    QueryExecutorCommand, 
	    DbCommand,
	    RandomDataGeneratorCommand,
	}
	
	/*
	 * If you want to introduce new command, register it here
	 */
	public enum CommandName {
		// DbCommand:
		StartInterface,
		ExitWithFinalCommit,
		ExitWithoutFinalCommit,
				
		// InterfaceCommad
	    SwitchToPage, 
	    DisplayTuples,
	    PrintStringImmediately,
	    
	    // QueryExecutorCommand
	    SearchEmployeeById,		
		AddEmployee,		
		DeleteEmployeeById,		
		UpdateEmpployeeById,
		SearchEmployBySalaryRange,
		RraiseSalaryForAllEmployee,
	}
	
	public CommandType getCommandType()
	{
		return commandType;		
	}
	
	public CommandName getCommandName()
	{
		return commandName;		
	}
		

}
