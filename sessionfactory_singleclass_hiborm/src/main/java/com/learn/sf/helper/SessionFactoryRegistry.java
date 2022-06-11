package com.learn.sf.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {

	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static SessionFactory getInstance() {
		return sessionFactory;
	}
	
	public static void  closeSessionFactory() {
		if(sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
