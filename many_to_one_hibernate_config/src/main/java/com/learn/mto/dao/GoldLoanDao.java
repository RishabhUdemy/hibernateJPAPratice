package com.learn.mto.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.mto.entities.GoldLoan;
import com.learn.mto.helper.SessionFactoryRegistry;

public class GoldLoanDao {

	public int saveGoldLoan(GoldLoan goldLoan) {
		boolean flag = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		int goldLoanNo = 0;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			goldLoanNo = (int)session.save(goldLoan);
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
		return goldLoanNo;
	}
	
	public GoldLoan getGoldLoan(int goldLoanNo) {
		SessionFactory sessionFactory=null;
		Session session = null;
		GoldLoan goldLoan = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			goldLoan = session.get(GoldLoan.class, goldLoanNo);
		}finally {
			if(session != null)
				session.close();
		}
		return goldLoan;
	}
}







