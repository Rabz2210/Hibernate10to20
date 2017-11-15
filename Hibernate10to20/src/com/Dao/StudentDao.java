package com.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bean.Student;

public class StudentDao {
	
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	public void add(Student obj) {
		try {
			Session session = sf.openSession();
			Transaction t=session.beginTransaction();
			session.save(obj);
			t.commit();
			session.close();
		} catch (HibernateException e) {
			
			System.out.println("Error in inserting data");
			e.printStackTrace();
		}
		System.out.println("Insertion done");	
	}

}
