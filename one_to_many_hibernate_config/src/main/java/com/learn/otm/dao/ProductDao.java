package com.learn.otm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.otm.entities.Product;
import com.learn.otm.helper.SessionFactoryRegistry;

public class ProductDao {

	public int saveProduct(Product product) {
		boolean flag = false;
		SessionFactory sessionFactory;
		Session session = null;
		Transaction transaction = null;
		int productNo = 0;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			productNo = (int) session.save(product);
			flag = true;
		} finally {
			if(transaction != null) {
				if(flag == true) {
					transaction.commit();
				}
				else {
					transaction.rollback();
				}
				session.close();
			}
		}
		return productNo;
	}
	
	public Product getProduct(int productNo) {
		SessionFactory sessionFactory;
		Session session = null;
		Product product = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			
			product = session.find(Product.class, productNo);
		}finally {
			if(session != null)
				session.close();
		}
		return product;
	}
}
