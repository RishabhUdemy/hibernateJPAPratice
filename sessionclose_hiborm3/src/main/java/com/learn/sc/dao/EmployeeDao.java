package com.learn.sc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learn.sc.entities.Employee;
import com.learn.sc.helper.SessionFactoryRegistry;

public class EmployeeDao {

	public Employee getEmployeeDetail(int empId) {
		Session session = null;
		SessionFactory sessionFactory = null;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			
			Employee employee = session.get(Employee.class, empId);
			return employee;
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
}
