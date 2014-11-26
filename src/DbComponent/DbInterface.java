package DbComponent;

import javax.naming.spi.DirStateFactory.Result;

import result.InterfaceCommandResult;
import command.Command;

public class DbInterface extends DbComponent {

	public Result executeCommand(Command command)
	{
		switch (command.getCommandName())
		{
		case SwitchToPage:
			this.
		}
		
	}
}
