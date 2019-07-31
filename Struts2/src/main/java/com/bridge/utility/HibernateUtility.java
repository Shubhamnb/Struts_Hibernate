package com.bridge.utility;




import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory ==null) {
			sessionFactory =new Configuration().configure("hibernet.cfg.xml").buildSessionFactory(); 
			return sessionFactory;
		}
		return sessionFactory;
	}
}
