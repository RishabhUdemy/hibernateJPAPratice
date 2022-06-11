package com.learn.sf.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learn.sf.entities.Address;
import com.learn.sf.helper.SessionFactoryRegistry;

public class AddressDao {

	public Address getAddressDetail(int addressNo) {
		Session session = null;
		SessionFactory sessionFactory = null;
		Address address = null;
		
		try {
			sessionFactory = SessionFactoryRegistry.getInstance();
			session = sessionFactory.openSession();
			address = session.get(Address.class, addressNo);
			return address;
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
}
