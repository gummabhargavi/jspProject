package infinite.jsfdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable{
	 
	public List<Employ> showEmploy(){
	List<Employ> employList = new ArrayList<Employ>();
	employList.add(new Employ(1,"bhargavi","java","developer",8234.87));
	employList.add(new Employ(2,"chandu","python","developer",9345.97));
	employList.add(new Employ(3,"anu","dotnet","developer",7659.77));
	employList.add(new Employ(4,"chinni","java","developer",6743.87));
	return employList;

}
}
