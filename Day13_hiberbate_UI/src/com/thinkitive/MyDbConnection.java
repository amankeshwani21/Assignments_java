package com.thinkitive;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;

public class MyDbConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	
	public MyDbConnection() {
		// TODO Auto-generated constructor stub
		cfg = new Configuration();

		factory = cfg.configure().buildSessionFactory();

		}

//	public void insertEmployee() {
//		Employee e = new Employee(13, "aman", 95600);
//		
//		Configuration cfg = new Configuration();
//
//		SessionFactory factory = cfg.configure().buildSessionFactory();
//
//		Session session = factory.openSession(); // CONNECTION OPEN
//
//		Transaction tx = session.beginTransaction();
//		
////		Query q=session.createQuery("From Employee where salary<50000");
////		
////		List l=q.list();
////		System.out.println(l);
//
////		session.save(e);
////		Employee e1=new Employee(13,"aman",78000);
////		session.update(e1);
//	
//		Employee e1=new Employee(13, "aman", 5600);
//		session.update(e1);
//
//		tx.commit();
//
//		session.close();
//		factory.close();
//
//	}
	
	public void insertEmployee(int id, String name, int sal) {
		Employee e = new Employee(id, name, sal);

		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		session.save(e);


		tx.commit();

		session.close();
		// factory.close();

		}
	
	public void updateEmployee(int id, String name, int sal) {
		Employee e = new Employee(id, name, sal);

		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		session.update(e);


		tx.commit();

		session.close();
		}
	
	public void deleteEmployee(int id, String name, int sal) {
		Employee e = new Employee(id, name, sal);

		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		session.delete(e);


		tx.commit();

		session.close();
		}
	
	public void showEmployee(int id, String name, int sal) {
		Employee e = new Employee(id, name, sal);
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		//Query q= session.createQuery("From Employee where salary < 90000");
		org.hibernate.Query q= session.createQuery("From Employee");
		java.util.List l = q.list();
		System.out.println(l);


		tx.commit();

		session.close();
		}

}
