import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Add extends Remote {
    double add(double d1,double d2)  throws RemoteException;
}
