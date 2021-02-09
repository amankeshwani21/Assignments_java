package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentOperations {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	
	public StudentOperations() {
		cfg=new Configuration();
		factory=cfg.configure().buildSessionFactory();
	}
      
	public int myMarks(Student s) {
		return s.getMarks();
	}
	
	
	public List<Questions>appearExam(int eid) {
		session=factory.openSession();
		tx=session.beginTransaction();
		List<Student> slist=new ArrayList<Student>();
		
		List<Questions> qlist=new ArrayList<Questions>();
		
		List<Questions> sendques=new ArrayList<Questions>();
		
		Criteria c=session.createCriteria(Questions.class);
		qlist=c.list();
	
		 for(Questions each:qlist) {
			 if(each.getExamid()==eid) {
				
					 sendques.add(each);	 
			 }
		 }
		
		
	    
		return sendques;	
	}
	
	
	
	public  Map<String, String> submitExam(int sid,int eid) {
		session=factory.openSession();
		tx=session.beginTransaction();
		
		List<Student> slist=new ArrayList<Student>();
		slist=this.getInfo();
		
		List<Questions> qlist=new ArrayList<Questions>();
		Criteria c=session.createCriteria(Questions.class);
		
		qlist=c.list();
		
//		List<String> s1=new ArrayList<String>();
//		List<String> s2=new ArrayList<String>();
		
		Map<String, String> answer=new HashMap <String, String>();
		
		for(Student stu:slist) {
			if(stu.getSid()==sid) {
				for(Questions ques : qlist) {
					if(ques.getExamid()==eid) {
						answer.put(ques.getQuestion(), ques.getCorrect());
						
					}
					
				}
			}
		}
	
		return answer;
		
	}
	

	public List<Student> getInfo() {
		session=factory.openSession();
		tx=session.beginTransaction();
		List<Student> elist=new ArrayList<Student>();
		Criteria c=session.createCriteria(Student.class);
		elist=c.list();
		tx.commit();
//		session.close();
		return elist;
	}
	
	public List<Exam> getExam(){
		session=factory.openSession();
		tx=session.beginTransaction();
		List<Exam> elist=new ArrayList<Exam>();
		Criteria c=session.createCriteria(Exam.class);
		elist=c.list();
		tx.commit();
		session.close();
		return elist;
	}
	
	public void addStudent(Student s) {
		 session=factory.openSession();
		 tx=session.beginTransaction();
		 session.save(s);
		 tx.commit();
		 session.close();
		 factory.close();
	}
	
	public void addExam(Exam e) {
		 session=factory.openSession();
		 tx=session.beginTransaction();
		 session.save(e);
		 tx.commit();
		 session.close();
//		 factory.close()
	}
	
	public void stuMarks(Student s) {
		session=factory.openSession();
		tx=session.beginTransaction();
//		List<Student> elist=new ArrayList<Student>();
//		Criteria c=session.createCriteria(Student.class);
//		elist=c.list();
//		for(Student each:elist) {
//			if(each.getSid()==sid) {
//				each.setMarks(marks);
//				session.update(each);
//				break;
//			}
//		}
	
		session.saveOrUpdate(s);
	
	}
	
	public void addQues(Questions q) {
		 session=factory.openSession();
		 tx=session.beginTransaction();
		 session.save(q);
		 tx.commit();
		 session.close();
//		 factory.close()
	}
	
//	public void addexatttm(Exam e) {
//		session=factory.openSession();
//		tx=session.beginTransaction();
//		List<Questions> ques=new ArrayList<Questions>();
//		e.setExamid(1);
//		e.setExamname("");
//		
//		Questions q1=new Questions();
//	    List<String> options1=new ArrayList<String>();
//		q1.setQuestionNumber(2);
//		q1.setQuestion("what is python");
//		options1.add("scripting language");
//		options1.add("programming language");
//		options1.add("programming language");
//		options1.add("programming language");
//		q1.setQuestionOptions(options1);
//		q1.setCorrectOptionIndex(1);
//		ques.add(q1);
//		
//		e.setQuestions(ques);
//		
//		
//		
//		 session.save(e);
//		 tx.commit();
//		 session.close();
////		 factory.close();
//		
//	}
		
}
