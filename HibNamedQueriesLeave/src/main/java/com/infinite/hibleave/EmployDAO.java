package com.infinite.hibleave;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




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
	
	public java.sql.Date ConvertDate(String dt) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d1 =  sdf.parse(dt);
		return new java.sql.Date(d1.getTime()) ;
		
	}
	 
//	public String addLeaveHistory(Leave leave){
//		sessionFactory = SessionHelper.getSession();
//        Session session = sessionFactory.openSession();
//		Query query = session.getNamedQuery("AddLeaveHistory");
//
//       // Criteria cr = session.createCriteria(Leave.class);
//        java.sql.Date sqlDate= new java.sql.Date(leave.getLeaveStartDate().getTime());
//        leave.setLeaveStartDate(sqlDate);
//        java.sql.Date sqlDate1= new java.sql.Date(leave.getLeaveEndDate().getTime());
//        leave.setLeaveEndDate(sqlDate1);
//        Transaction trans =session.beginTransaction();
//        session.save(leave);
//        trans.commit();
//        session.close();
//		return "LeaveHistory Added...";
//        
//        
//	}
//	
}
