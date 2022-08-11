package primjer1.command;

import primjer1.reciever.FileSystemReciever;

public class WriteFileCommand implements Command {

	private FileSystemReciever fileSystem;
	
	public WriteFileCommand(FileSystemReciever fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}

}
