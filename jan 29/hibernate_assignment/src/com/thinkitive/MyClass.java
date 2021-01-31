package com.thinkitive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		SessionFactory factory=cfg.configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
//		Criteria c=session.createCriteria(Employee.class);
////		c.add(Restrictions.gt("salary", 1000));
//		c.add(Restrictions.eq("ename", name));
//		l=c.list();
		
//		Address a=new Address(424056,"indore");
//		session.save(a);
		Set<Address> l1=new HashSet<Address>();
		Address a1=new Address(34567,"delhi");
		
		Address a2=new Address(463098,"jaipur");
		l1.add(a1);
		l1.add(a2);
		Employee e1=new Employee(160,"Avni",56000,l1);
//		Employee e2=new Employee(1000,"avni",3000,l1);
		session.save(e1);
//	session.delete(e1);
//		session.delete(e1);
		
		t.commit();
		session.close();                                        
		factory.close();
		return l;
		
	}

}
