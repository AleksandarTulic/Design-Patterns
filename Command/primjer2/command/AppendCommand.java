package primjer2.command;

import primjer2.reciever.*;

public class AppendCommand implements Command{
	private Document document;
	private String state;
	
	public AppendCommand(Document document) {
		this.document = document;
	}
	
	@Override
	public void execute(String content) {
		state = document.getState();
		document.append(content);
	}

	@Override
	public void undo() {
		document.write(state);
	}

}
