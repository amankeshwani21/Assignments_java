package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DbOperations {
	
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	public DbOperations() {
		cfg=new Configuration();
		factory=cfg.configure().buildSessionFactory();
	}
    
	public void add(Employee e) {
         session=factory.openSession();
		
		 t=session.beginTransaction();
		 session.save(e);
		 t.commit();
		 session.close();
		 factory.close();
	}
}
