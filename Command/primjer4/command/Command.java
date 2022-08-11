package primjer4.command;

import primjer4.history.*;

public abstract class Command {
	protected CommandHistory history;
	
	public Command(CommandHistory history) {
		this.history = history;
	}
	
	public abstract void execute(String content);
	public abstract void undo();
}
