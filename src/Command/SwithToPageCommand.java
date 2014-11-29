package Command;


public class SwithToPageCommand extends InterfaceCommand {
	
	private long swithToPageId;
	
	public SwithToPageCommand(long swithToPageId)
	{
		this.commandId=generteCommandId();
		this.commandType=CommandType.InterfaceCommand;
		this.commandName=CommandName.SwitchToPage;		
		this.swithToPageId=swithToPageId;		
	}
	
	public long getSwitchToPageId()
	{
		return swithToPageId;
		
	}

}
