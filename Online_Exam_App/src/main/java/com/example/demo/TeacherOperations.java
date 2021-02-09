package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TeacherOperations {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	
    
	List<Student> l=new ArrayList<Student>();
	public TeacherOperations() {
		cfg=new Configuration();
		factory=cfg.configure().buildSessionFactory();
		
	}
	
	
	public List<Teacher> getInfo(Teacher t) {
		session=factory.openSession();
		tx=session.beginTransaction();
		List<Teacher> elist=new ArrayList<Teacher>();
		Criteria c=session.createCriteria(Teacher.class);
		elist=c.list();
		tx.commit();
		session.close();
		return elist;
	}
	
	
	public void addTeacher(Teacher t) {
		 session=factory.openSession();
		 tx=session.beginTransaction();
		 session.save(t);
		 tx.commit();
		 session.close();
//		 factory.close();
	}
	
	
	
	public Student getMarks(Integer sid) {
		Student temp=null;
		for(Student s:l) {
			if(s.getSid()==sid) {
				temp=s;
			}
		}
		return temp;
	}
	
	public List<Student> getAll(){
		return l;
	}
}
