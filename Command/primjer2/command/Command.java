package primjer2.command;

public interface Command {
	void execute(String content);
	void undo();
}
