package com.learn.ha.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learn.ha.entities.Merchant;
import com.learn.ha.helper.SessionFactoryRegistry;

public class MerchantDao {

	public Merchant getMerchantDetail() {
		SessionFactory sessionFactory = null;
		Session session = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		session = sessionFactory.openSession();
		
		Merchant merchant = session.get(Merchant.class, 1);
		return merchant;
		
		
	}
}
