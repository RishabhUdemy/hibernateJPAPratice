package com.learn.sc.test;

import com.learn.sc.dao.EmployeeDao;
import com.learn.sc.entities.Employee;
import com.learn.sc.helper.SessionFactoryRegistry;

public class SessionCloseTest {

	public static void main(String[] args) {
		
		EmployeeDao employeeDao = null;
		try {
		employeeDao = new EmployeeDao();
		Employee emp = employeeDao.getEmployeeDetail(1);
		System.out.println(emp);
		}finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
		
	}
}
