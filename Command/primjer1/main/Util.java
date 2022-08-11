package primjer1.main;

import primjer1.reciever.*;
import java.util.*;

public class Util {
	private static Random rand = new Random();
	
	public static FileSystemReciever get() {
		int value = rand.nextInt(2);
		if (value == 0)
			return new WindowsFileSystemReciever();
		else
			return new UnixFileSystemReciever();
	}
}
