import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Server extends UnicastRemoteObject implements Hello {

    Server() throws RemoteException {}

    public String sayHello(String name) {
        return "Hello, " + name + "! from Server";
    }

    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("HelloService", new Server());
        System.out.println("Server is running...");
    }
}
