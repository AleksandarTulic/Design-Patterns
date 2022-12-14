import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public Client() {
	}
	
	public static void main(String []args) {
		String host = (args.length < 1) ? null : args[0];
		
		try {
			Registry registryStub = LocateRegistry.getRegistry(host);
			ServerInterface serverStub = (ServerInterface)registryStub.lookup("Server");
			String response = serverStub.getRandomString();
			System.out.println("Response: " + response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
