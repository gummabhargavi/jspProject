package com.infinite.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ShowAll {
	
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		for (Employ employ : employList) {
			System.out.println("Employ No " +employ.getEmpno());
			System.out.println("Employ Name " +employ.getName());
			System.out.println("Cubical ID " +employ.getWorkStation().getCubicalId());
			System.out.println("Floor No " +employ.getWorkStation().getFloorNo());
			System.out.println("Domain " +employ.getWorkStation().getDomain());
		}
	}

}
