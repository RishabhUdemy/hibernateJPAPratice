package com.learn.idgenerators.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.idgenerators.entities.Outlet;
import com.learn.idgenerators.helper.SessionFactoryRegistry;

public class OutletDao {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction tx;
	private boolean flag;
	
	/* public int getOutletId(Outlet outlet) { */
	public String getOutletId(Outlet outlet) {
		String outletNo;
		flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			/* outletNo = (Integer)session.save(outlet); */
			outletNo = (String)session.save(outlet);
			flag = true;
		} finally {
			
			if(tx != null) {
				if(flag == true)
					tx.commit();
				else
					tx.rollback();
			}
			if(session != null) {
				session.close();
			}
		}
		return outletNo;
	}
}
