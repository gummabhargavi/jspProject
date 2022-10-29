package com.infinite.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class QuestionDAO {
	
SessionFactory sessionFactory;
	
	public String addQuestion(Question question) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(question);
		transaction.commit();
		return "Question Added Successsfully...";
	}
	public String addAnswer(Answer answer) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(answer);
		transaction.commit();
		return "Answer Added Successsfully...";
	}
	
	public List<Question> showQuestion(){
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Question");
		List<Question> questionList = query.list();
	    
		return questionList;	
	}
	
	
}
