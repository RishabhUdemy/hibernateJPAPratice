package com.idgenerator.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.idgenerator.jpa.entities.Bill;
import com.idgenerator.jpa.helper.EntityManagerFactoryRegistry;

public class BillDao {

	public int getBillNo(Bill bill) {
		int billNo = 0;
		boolean flag = false;
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getenEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(bill);
			
			billNo = bill.getBillNo();
			flag = true;
		}finally {
			if(entityTransaction != null) {
				if(flag)
					entityTransaction.commit();
				else
					entityTransaction.rollback();
			}
			if(entityManager != null) {
				entityManager.close();
			}
		}
		return billNo;
	}
}
