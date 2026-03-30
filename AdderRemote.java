import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    
    // Required default constructor due to UnicastRemoteObject throwing RemoteException
    public AdderRemote() throws RemoteException {
        super();
    }
    
    public int add(int x, int y) throws RemoteException {
        return x + y;
    }
}
