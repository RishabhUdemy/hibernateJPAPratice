package com.learn.cpkjpa.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {

	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate1");
	}
	
	public static EntityManagerFactory getenEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	public void closeEntityManagerFactory() {
		if(entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}
}
