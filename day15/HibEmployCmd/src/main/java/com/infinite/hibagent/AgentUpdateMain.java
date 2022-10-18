package com.infinite.hibagent;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AgentUpdateMain {
    public static void main(String[] args) {
    	Agent agent=new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Agent Number");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent Name");
		agent.setName(sc.next());
		System.out.println("Enter City");
		agent.setCity(sc.next());
		System.out.println("Enter gender");
		agent.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enetr MaritalStatus");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter premium");
		agent.setPremium(sc.nextDouble());
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Agent where AgentId="+agent.getAgentId());
		List<Agent> agentList = query.list();
		session.close();
		if(agentList.size()==1){
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.saveOrUpdate(agent);
			trans.commit();
			System.out.println("*** Record Updated ***");
		} else {
			System.out.println("*** Record not Found ***");
		}
		}
	}

