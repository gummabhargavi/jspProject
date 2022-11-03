import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImp1 extends UnicastRemoteObject implements Hello  {

	protected HelloImp1() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Welcome to RMI Programming...";
	}

}
