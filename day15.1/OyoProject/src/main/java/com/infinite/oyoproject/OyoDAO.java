package com.infinite.oyoproject;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;







public class OyoDAO {
	
	SessionFactory sessionFactory;
	
	public String generateRoomId(){
	 sessionFactory = SessionHelper.getConnection();
	 Session session = sessionFactory.openSession();
	 Criteria cr = session.createCriteria(Room.class);
	 List<Room> roomList = cr.list();
	 session.close();
	 String id = roomList.get(roomList.size()-1).getRoomId();
	 int id1 = Integer.parseInt(id.substring(1));
	 id1++;
	 String id2 = String.format("R%03d", id1);
	return id2;
	 
	}
	
	public String addRoom(Room room){
		//room.setRoomId("R001");
	   String roomId=generateRoomId();
	   room.setRoomId(roomId);
	   room.setStatus(Status.AVAILABLE);
	   sessionFactory = SessionHelper.getConnection();
	   Session session = sessionFactory.openSession();
	   Criteria cr = session.createCriteria(Room.class);
	   Transaction trans = session.beginTransaction();
	   session.save(room);
	   trans.commit();
	return "Room Added" ;
	   
	}
	
	public List<Room> searchRoom(String searchtype, String searchvalue) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
		Criteria cr = session.createCriteria(Room.class);

		if (searchtype.equals("roomid")) {
			cr.add(Restrictions.eq("id", searchvalue));
		} 
//		if (searchtype.equalsIgnoreCase("roomid")) {
//		
//			cr.add(Restrictions.eq("dept", searchvalue));
//		}

		if (searchtype.equalsIgnoreCase("type")) {
			cr.add(Restrictions.eq("type", searchvalue));
		}

		if (searchtype.equalsIgnoreCase("status")) {
			cr.add(Restrictions.eq("status", searchvalue));
		}
		if (searchtype.equalsIgnoreCase("CostPerDay")) {
			int  CostPerDay=Integer.parseInt(searchvalue);
			cr.add(Restrictions.eq("CostPerDay", CostPerDay));
		}

		List<Room> lst = cr.list();
			return lst;
	}
	
	public Room searchById(String id) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
		Criteria cr = session.createCriteria(Room.class);
			cr.add(Restrictions.eq("id", id));
		List<Room> roomList = cr.list();
		return roomList.get(0);
	}
	
	
}
