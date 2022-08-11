package primjer1.main;

import primjer1.command.CloseFileCommand;
import primjer1.command.OpenFileCommand;
import primjer1.command.WriteFileCommand;
import primjer1.invoker.FileInvoker;
import primjer1.reciever.FileSystemReciever;

public class Main {

	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReciever fs = Util.get();
		
		//creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		
		//Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
		
		//perform action on invoker object
		file.execute();
		
		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
		
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
		
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
