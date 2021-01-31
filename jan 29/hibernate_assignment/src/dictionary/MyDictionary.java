package dictionary;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.annotations.Address;

public class MyDictionary {
      
	
	public List getEmployee(String word){
		List l=null;
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
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
//		
//		Dictionary d=new Dictionary("aman","peace");
//		Dictionary d1=new Dictionary("rahul","peace1111");
//		session.save(d);
//		session.save(d1);
		Criteria c=session.createCriteria(Dictionary.class);
		c.add(Restrictions.eq("word", word));
		l=c.list();
		t.commit();
		session.close();
		factory.close();
		return l;
		
		
		
		
	}
	
}
