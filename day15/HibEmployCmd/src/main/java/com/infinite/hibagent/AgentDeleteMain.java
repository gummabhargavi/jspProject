package com.infinite.hibagent;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.infinite.hib.Employ;

public class AgentDeleteMain {
	
	public static void main(String[] args) {
		int AgentId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Agent Id");
		AgentId = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Agent where AgentId="+AgentId);
		List<Agent> agentList = query.list();
		if(agentList.size()==1){
			Transaction trans = session.beginTransaction();
			session.delete(agentList.get(0));
			trans.commit();
			System.out.println("***Recored Deleted***");
		}else{
			System.out.println("***Record not Found***");
		}
	}

}
