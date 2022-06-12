package com.learn.tx.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.tx.entities.LoanAccount;
import com.learn.tx.helper.SessionFactoryRegistry;

public class LoanAccountDao {

	public void getLoanAccountDetail(LoanAccount loanAccount) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();
			session.save(loanAccount);
			System.out.println("Loan Detail save in the database.");
			flag = true;
		}finally {
			if(transaction != null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			if(session != null) {
				session.close();
			}
		}
	}
}
