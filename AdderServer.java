import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdderServer {
    public static void main(String args[]) {
        try {
            // Create the remote object
            AdderRemote stub = new AdderRemote();
            
            // Create RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);
            
            // Bind the remote object by the name "AdderService"
            registry.rebind("AdderService", stub);
            
            System.out.println("AdderServer is ready and running.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
