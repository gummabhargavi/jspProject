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
    
	public Employ searchEmploy(int empId) {
		sessionFactory = SessionHelper.getSession();
  	    Session session=sessionFactory.openSession();  
		Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empId",empId);   
		List<Employ> employList = query.list();
		if (employList.size()==0) {
			return null;
		} 
		return employList.get(0);
	}
}
