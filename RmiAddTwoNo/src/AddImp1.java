import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImp1 extends UnicastRemoteObject implements Add {

	protected AddImp1() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double add(double d1, double d2) throws RemoteException {
		// TODO Auto-generated method stub
		return d1+d2;
	}

}
