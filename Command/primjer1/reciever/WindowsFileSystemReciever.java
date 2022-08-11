package primjer1.reciever;

public class WindowsFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("Opening file in WINDOWS");
		
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in WINDOWS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in WINDOWS");
	}

}
