package primjer4.invoker;

import primjer4.command.*;

public class DocumentInvoker {
	private Command command;
	
	public DocumentInvoker(Command command) {
		this.command = command;
	}
	
	public void execute(String content) {
		command.execute(content);
	}
	
	public void undo() {
		command.undo();
	}
}
