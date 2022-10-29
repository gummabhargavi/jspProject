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
		Query query = session.createQuery("from Question");
		List<Question> questionList = query.list();
		for (Question question : questionList) {
			System.out.println("Question name " +question.getQname());
			Query q2 = session.createQuery("from Answer where qid=" +question.getId());
			List<Answer> answers = q2.list();
			for (Answer answer : answers) {
				System.out.println("Answer  " +answer.getAnswerName());
				System.out.println("Posted By  " +answer.getPostedBy());
				System.out.println("-----------------------------");
			}
			
		}
	

	}

}
