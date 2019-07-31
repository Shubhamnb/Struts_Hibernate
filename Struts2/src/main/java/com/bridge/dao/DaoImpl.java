package com.bridge.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridge.pojo.User;
import com.bridge.utility.HibernateUtility;

public class DaoImpl implements IDao {

	public boolean register(User user) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		System.out.println(user);
		session.save(user);
		transaction.commit();
		session.close();
		
		return true;
	}

	public boolean login(String email, String password) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from "+User.class.getName()+" where email = :email");
		query.setParameter("email", email);
		User user = (User) query.uniqueResult();
		tx.commit();
		session.close();
		if(user == null)
			return false;
		if(user.getPassword().equals(password))
			return true;
		else
			return false;
	}

}
