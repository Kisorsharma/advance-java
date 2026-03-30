import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdderClient {
    public static void main(String args[]) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            
            // Look up the remote object
            Adder stub = (Adder) registry.lookup("AdderService");
            
            // Initializing variables for addition
            int num1 = 15;
            int num2 = 25;
            
            if (args.length == 2) {
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[1]);
            }
            
            // Call the remote method
            int result = stub.add(num1, num2);
            
            System.out.println("Invoking remote method add(" + num1 + ", " + num2 + ")...");
            System.out.println("The sum is: " + result);
            
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
