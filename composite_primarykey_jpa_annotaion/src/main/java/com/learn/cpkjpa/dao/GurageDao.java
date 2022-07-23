package com.learn.cpkjpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.learn.cpkjpa.entities.Gurage;
import com.learn.cpkjpa.entities.GuragePk;
import com.learn.cpkjpa.helper.EntityManagerFactoryRegistry;

public class GurageDao {

	public void gurageDetailInsertion(Gurage gurage) {
		boolean flag = false;
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getenEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(gurage);
			
			flag = true;
		} finally {
			if(entityTransaction != null) {
				if(flag == true)
					entityTransaction.commit();
				else
					entityTransaction.rollback();
			}
			if(entityManager != null) {
				entityManager.close();
			}
		}
		
	}
	
	public Gurage getGurageDetail(String gurageName,String gurageCode) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		GuragePk guragePk = null;
		
		entityManagerFactory = EntityManagerFactoryRegistry.getenEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
		guragePk = new GuragePk();
		guragePk.setGurageClubRegNo(gurageCode);
		guragePk.setGurageName(gurageName);
		
		Gurage gurage = entityManager.find(Gurage.class, guragePk);
		return gurage;
	}
}










