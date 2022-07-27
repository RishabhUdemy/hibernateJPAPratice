package com.learn.otm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.otm.entities.Review;
import com.learn.otm.helper.SessionFactoryRegistry;

public class ReviewDao {

	public int saveReview(Review review) {
		boolean flag = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		int reviewNo = 0;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			reviewNo = (int)session.save(review);
			flag = true;
		}finally {
			if(tx != null) {
				if(flag == true)
					tx.commit();
				else
					tx.rollback();
				session.close();
			}
		}
		return reviewNo;
	}
	
	public Review getReview(int reviewNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Review review = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			review = session.find(Review.class, reviewNo);
		}finally {
			if(session != null)
				session.close();
		}
		return review;
	}
}
