package command;


public class Command {
	
	static long maxCommandId;
	
	public long commandId;
	
	public enum CommandType {
	    InterfaceCommand, 
	    QueryExecutorCommand, 
	    DbCommand 
	}
	
	/*
	 * If you want to introduce new command, register it in CommandDictionary
	 * 
	 * 
	 */
	public enum CommandDictionary {
		// DbCommand:
		StartInterface,
		Exit,
				
		// InterfaceCommad
		RunInterface,
	    SwitchToPage, 
	    
	    // QueryExecutorCommand
	    ShowEmployById,
		ShowEmployBySalaryRange,		
		AddEmployee,		
		DeleteEmployeeById,		
		UpdateEmployeeById
	}
		

}
