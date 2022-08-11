package primjer2.command;

import primjer2.reciever.*;

public class WriteCommand implements Command{
	private Document document;
	private String state;
	
	public WriteCommand(Document document) {
		this.document = document;
	}
	
	@Override
	public void execute(String content) {
		state = document.getState();
		document.write(content);
	}

	@Override
	public void undo() {
		document.write(state);
	}
}
