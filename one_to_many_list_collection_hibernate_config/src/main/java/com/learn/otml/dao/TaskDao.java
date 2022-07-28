package com.learn.otml.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.otml.entities.Task;
import com.learn.otml.helper.SessionFactoryRegistry;

public class TaskDao {

	public int saveTaskDetail(Task task) {
		boolean flag = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		int taskNo = 0;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			taskNo = (int) session.save(task);
			flag = true;
		}finally {
			if(tx != null) {
				if(flag == true) {
					tx.commit();
				}else {
					tx.rollback();
				}
				if(session!= null) {
					session.close();
				}
			}
		}
		return taskNo;
	}
	
	public Task getTaskInfo(int taskNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Task task = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			task = session.find(Task.class, taskNo);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return task;
	}
}
