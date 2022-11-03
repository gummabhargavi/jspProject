import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class AddServer {
   
	 public static void main(String[] args) {
		 try
			{
				System.setSecurityManager(new RMISecurityManager());
				Add h = new AddImp1();
				Naming.rebind("localhost", h);
				System.out.println("Object is registered...");
				System.out.println("Now the server is waiting for the client request");
			}
			catch (Exception e)
			{
				System.out.println("Error  " + e);
			}
		
	}
}
