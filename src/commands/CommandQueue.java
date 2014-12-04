package commands;

import java.util.Queue;

import command.Command;

public class CommandQueue extends Commands {

	private Queue<Command> commandQueue;
	
	@Override
	public Command nextCommand() {
		return commandQueue.poll();
	}

	@Override
	public void appendCommand(Command command) {
		commandQueue.add(command);
	}

	@Override
	public boolean empty() {		
		return commandQueue.isEmpty();
	}
	
	public void clearAllCommands()
	{
	   commandQueue.clear();	 		 
	}

}
