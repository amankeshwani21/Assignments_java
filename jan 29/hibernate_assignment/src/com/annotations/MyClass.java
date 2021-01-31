package com.annotations;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.spi.Configurable;

public class MyClass {
  
	public List getEmployee(){
		List l=null;
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Address.class);
		SessionFactory factory=cfg.configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
//		Criteria c=session.createCriteria(Employee.class);
////		c.add(Restrictions.gt("salary", 1000));
//		c.add(Restrictions.eq("ename", name));
//		l=c.list();
		
//		Address a=new Address(424056,"indore");
//		session.save(a);
//		l=session.createQuery("from Address").list();
//		System.out.println(l);
		
		
		t.commit();
		session.close();
		factory.close();
		return l;
		
		
		
		
	}
	

}

