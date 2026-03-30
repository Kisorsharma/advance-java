import java.rmi.*;
import java.rmi.registry.*;

public class Client {

    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        Hello hello = (Hello) registry.lookup("HelloService");
        System.out.println(hello.sayHello("world!"));
    }
}
