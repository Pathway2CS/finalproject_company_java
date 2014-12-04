package commands;

import command.Command;

public abstract class Commands {
	
	abstract public boolean empty();
	abstract public void clearAllCommands();
	abstract public Command nextCommand(); // this method returns the next command to be executed, and remove it from the Commands
	abstract public void appendCommand(Command command);
	
	
}
