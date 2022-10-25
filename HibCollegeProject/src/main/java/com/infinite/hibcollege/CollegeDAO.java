package com.infinite.hibcollege;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




public class CollegeDAO {
	 
	SessionFactory sessionFactory;
	
	public String generateCourseNo(){
		 sessionFactory = SessionHelper.getConnection();
		 Session session = sessionFactory.openSession();
		 Criteria cr = session.createCriteria(Course.class);
		 List<Course> courseList = cr.list();
//		 if(courseList.size()==0){
//			 return "C001";
//		 }
		
		 String id = courseList.get(courseList.size()-1).getCourseNo();
		 int id1 = Integer.parseInt(id.substring(1));
		 id1++;
		 String id2 = String.format("C%03d", id1);
		return id2;
		 
		}
	
	  public java.sql.Date convertDate(String dt) throws ParseException{
		  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 Date d1 =  sdf.parse(dt);
		return new java.sql.Date(d1.getTime());
		  
	  }
	
	public String addCourse(Course course){
		sessionFactory = SessionHelper.getConnection();
		   Session session = sessionFactory.openSession();
//		   Criteria cr= session.createCriteria(Course.class);
		 String courseNo=generateCourseNo();
		 course.setCourseNo(courseNo);
		java.sql.Date sqlDate = new java.sql.Date(course.getStartDate().getTime());
		course.setStartDate(sqlDate);
    	java.sql.Date sqlDate1 = new java.sql.Date(course.getEndDate().getTime());
		course.setEndDate(sqlDate1);
		
		
//		 Date startDate = course.getStartDate();
//	     Date endDate= course.getEndDate();
//		 java.sql.Date sqlDate2 = new java.sql.Date(endDate.getTime());
//		course.setStartDate(sqlDate1);
//		course.setEndDate(sqlDate2);
	   
	   Transaction trans = session.beginTransaction();
	   session.save(course);
	   trans.commit();
	   session.close();
	return "Added Course" ;
	   
	}

}
