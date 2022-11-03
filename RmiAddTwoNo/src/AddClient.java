import java.rmi.Naming;

public class AddClient {
     
	public static void main(String[] args) {
		try
		{
			Add h = (Add)Naming.lookup("localhost");
			System.out.println("Client Program");
			System.out.println("Server :  " + h.add(12, 55));
		}
		catch (Exception e1)
		{
			System.out.println(e1);
		}
	}
}
