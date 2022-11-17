import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class Server implements ServerInterface{
	private static List<String> arr = new ArrayList<String>();
	private static Random rand = null;
	
	static {
		for (int i=0;i<5;i++) 
			arr.add("Operation_" + i);
	
		rand = new Random();
	}
	
	public Server() {
	}
	
	public String getRandomString() {;
		return arr.get(rand.nextInt(5));
	}
	public static void main(String []args) {
		try {
			Server obj = new Server();
			ServerInterface serverStub = (ServerInterface)UnicastRemoteObject.exportObject(obj, 0);
			
			Registry registryStub = LocateRegistry.getRegistry();
			registryStub.bind("Server", serverStub);
			
			System.out.println("Server Ready ...");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

interface ServerInterface extends Remote{
	String getRandomString() throws RemoteException;
}
