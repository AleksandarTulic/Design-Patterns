package primjer4.command;

import primjer4.reciever.*;
import primjer4.history.*;

public class AppendCommand extends Command{
	private Document document;
	
	public AppendCommand(Document document, CommandHistory history) {
		super(history);
		this.document = document;
	}
	
	@Override
	public void execute(String content) {
		history.add(document.content);
		document.append(content);
	}

	@Override
	public void undo() {
		document.write(history.remove());
	}

}
