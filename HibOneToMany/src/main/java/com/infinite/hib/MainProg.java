package com.infinite.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {
	
	public static void main(String[] args) {
		SessionFactory sf= new  AnnotationConfiguration().configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction trans=session.beginTransaction();
		
		Question question = new Question();
		question.setQname("What is Java?");
		
		Answer ans=new Answer();
		ans.setAnswerName("java is a programming language");
		ans.setPostedBy("Prasanna pappu");
		 
		Answer ans2=new Answer();
		ans2.setAnswerName("By Using Java we can make any kind of Applications");
		ans2.setPostedBy("Bhargavi Gumma");
		
		List<Answer> lstAnswers1 = new ArrayList<Answer>();
		lstAnswers1.add(ans);
		lstAnswers1.add(ans2);
		
		question.setAnswers(lstAnswers1);
        session.save(question);
        trans.commit();
	}

}
