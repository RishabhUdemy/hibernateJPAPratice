package com.learn.otml.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {

	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata()
				.getSessionFactoryBuilder().applyAutoClosing(true).build();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void closeSessionFactory() {
		if(sessionFactory != null)
			sessionFactory.close();
	}
}
