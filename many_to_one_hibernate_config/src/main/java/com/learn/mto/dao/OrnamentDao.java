package com.learn.mto.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.mto.entities.GoldLoan;
import com.learn.mto.entities.Ornament;
import com.learn.mto.helper.SessionFactoryRegistry;

public class OrnamentDao {

	public int saveOrnament(Ornament ornament) {

		boolean flag = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		int ornamentNo = 0;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			ornamentNo = (int)session.save(ornament);
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
		return ornamentNo;
	}
	
	public Ornament getGoldLoan(int ornamentNo) {
		SessionFactory sessionFactory=null;
		Session session = null;
		Ornament ornament = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			ornament = session.find(Ornament.class, ornamentNo);
		}finally {
			if(session != null)
				session.close();
		}
		return ornament;
	}
}
