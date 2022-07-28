package com.learn.otml.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.otml.entities.Member;
import com.learn.otml.entities.Task;
import com.learn.otml.helper.SessionFactoryRegistry;

public class MemberDao {

	public int saveMemberDetail(Member task) {
		boolean flag = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		int memberNo = 0;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			memberNo = (int) session.save(task);
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
		return memberNo;
	}
	
	public Member getMemberInfo(int taskNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Member member = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			member = session.find(Member.class, taskNo);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return member;
	}
}
