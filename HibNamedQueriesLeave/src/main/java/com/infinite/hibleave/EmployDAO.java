package com.infinite.hibleave;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class EmployDAO {
	
	SessionFactory sessionFactory;
	
	
	public List<Employ> showEmploy() {
		sessionFactory=SessionHelper.getSession();
  	    Session session=sessionFactory.openSession();  
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}

}
