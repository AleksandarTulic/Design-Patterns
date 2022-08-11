package primjer1.command;

import primjer1.reciever.FileSystemReciever;

public class CloseFileCommand implements Command {

	private FileSystemReciever fileSystem;
	
	public CloseFileCommand(FileSystemReciever fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

}
