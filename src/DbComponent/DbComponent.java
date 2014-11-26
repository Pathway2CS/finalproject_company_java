package DbComponent;

import javax.naming.spi.DirStateFactory.Result;

import command.Command;

public abstract class DbComponent {
	
	static long maxComponentId;
	long componentId;
	
	protected long generteComponentId()
	{
		long Id=maxComponentId;
		maxComponentId++;	
		return Id;
	}
	
	public abstract Result executeCommand(Command command);

}
