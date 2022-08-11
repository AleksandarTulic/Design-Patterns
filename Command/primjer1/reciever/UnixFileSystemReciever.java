package primjer1.reciever;

public class UnixFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("Opening file in unix OS");
		
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in unix OS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in unix OS");
	}

}
