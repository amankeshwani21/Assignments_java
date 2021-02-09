package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class Controller {
	
  
	StudentOperations sto=new StudentOperations();
	
	TeacherOperations to=new TeacherOperations();
	
	 @Autowired 
	 private HttpSession session;
	
	
	
    
	@PostMapping(value="/logins")
	public Student slogin(@RequestBody Student s) {
		
		int id= s.getSid();
		String password=s.getPassword();
		List<Student> slist=new ArrayList<Student>();
		slist=sto.getInfo();
		for(Student each:slist) {
			if(each.getSid()==id && each.getPassword().equals(password) ) {
				
		
				System.out.println(session.getId());
				session.setAttribute("id", id);
				session.setAttribute("password", password);
				session.setAttribute("role", "student");
			     return each;
			}
		}
		
		return null;
	}
	
	@PostMapping(value="/logint")
	public Teacher tlogin(@RequestBody Teacher t) {
		int id= t.getTid();
		String password=t.getPassword();
		List<Teacher> tlist=new ArrayList<Teacher>();
		tlist=to.getInfo(t);
		for(Teacher each:tlist) {
			if(each.getTid()==id && each.getPassword().equals(password) ) {
				System.out.println(session.getId());
				 session.setAttribute("id", id);
				 session.setAttribute("password", password);
				 session.setAttribute("role", "teacher");
			     return each;
				
			}
		}
		return null;
	}
	
	 @PostMapping (value="/addquestion")
	 
	 public Questions addq(@RequestBody Questions q) {
		 int id=(int) session.getAttribute("id");
		 String password=(String) session.getAttribute("password");
		 String role=(String) session.getAttribute("role");
		 if(password!=null && role.equals("teacher")) {
			 int examid=q.getExamid();
			 List<Exam> exlist=new ArrayList<Exam>();
			 exlist=sto.getExam();
			 for(Exam each:exlist) {
				 if(each.getExamid()==q.getExamid()) {
					 sto.addQues(q);
					 return q;
				 }
			 }
		 }
		 session.invalidate();
		
		 return null;
		 	
	 }
	 
	 @GetMapping (value="/getques")
	 public List<Questions> getques(@RequestBody Exam e){
		 
		 int id=(int) session.getAttribute("id");
		 String password=(String) session.getAttribute("password");
		 String role=(String) session.getAttribute("role");
		
		 
		 if(password!=null && role.equals("student")) {

		 int num=e.getExamid();
		 List<Questions> gques=new ArrayList<Questions>();
		 List gques1=new ArrayList();
		 gques=sto.appearExam(num);
		 for(Questions each:gques) {
			 List l=new ArrayList();
			 l.add(each.getQuestion());
			 l.add(each.getOp1());
			 l.add(each.getOp2());
			 l.add(each.getOp3());
			 l.add(each.getOp4());
			 gques1.add(l);	  
		 }
		 return gques1;
		 }
		return null;
		 
	 }
	

	 @PostMapping(value="/addstudent")
	 public Student adds(@RequestBody Student s ) { 
		 int id=(int) session.getAttribute("id");
		 String password=(String) session.getAttribute("password");
		 String role=(String) session.getAttribute("role");
		 if(password!=null && role.equals("teacher")) {
			 sto.addStudent(s);
				return s;
		 }
		 session.invalidate();
		 return null;
	   
		 
	 }
	 
	 @PostMapping(value="/addteacher")
	 public Teacher addt(@RequestBody Teacher t) {
		 int id=(int) session.getAttribute("id");
		 String password=(String) session.getAttribute("password");
		 String role=(String) session.getAttribute("role");
		 if(password!=null && role.equals("teacher")) {
			 to.addTeacher(t);
			 return t;
		 }
		 session.invalidate();
		 return null;
		
	 }
	 
	 @PostMapping (value="/addexam")
	 
	 public Exam adde(@RequestBody Exam e) {
		 try {
		 int id=(int) session.getAttribute("id");
		 String password=(String) session.getAttribute("password");
		 String role=(String) session.getAttribute("role");
		 
		 if(password!=null && role.equals("teacher")) {
			 sto.addExam(e);
			 return e;
		 }
		 
		 session.invalidate();
		 return null;
		 }
		 catch(Exception excep) {
			 return null;
		 }
		
	 }
	 

	 
	 @GetMapping(value="/getstudent")
	 public List<Student>  gets(Student s ) { 
		 
		 int id=(int) session.getAttribute("id");
		 String password=(String) session.getAttribute("password");
		 String role=(String) session.getAttribute("role");
		 if(password!=null && role.equals("teacher")) {
			 List<Student> gques=new ArrayList<Student>();
			 gques=sto.getInfo();
				return gques;
		 }
		     session.invalidate();
			return null; 
		 }
	 
	 @PostMapping (value="/submitexam")
	 public int result(@RequestBody QuestionPaper q ) {
		 
		 int id=(int) session.getAttribute("id");
		 String password=(String) session.getAttribute("password");
		 String role=(String) session.getAttribute("role");
		 
		 
		 if(password!=null && role.equals("student")){
		 int count=0;
		 HashMap<String, String> answers= new HashMap<String,String>();		 
		 List<Student> stu=new ArrayList<Student>();
		 stu=q.getStu();
		 
		 List<Questions> que=new ArrayList<Questions>();
		 que=q.getQues();
		 
//		 System.err.println(stu.get(0));
//		 System.out.println(que.get(0));
		 
		 List<String> s1=new ArrayList<String>();
		 List<String> s2=new ArrayList<String>();
		 for(Questions qs:que) {
			
			 s1.add(qs.getQuestion());
			 s2.add(qs.getCorrect());
		 }
//		 for(int i=1;i<s2.size();i++) {
//			 System.out.println(s2.get(i));
//		 }
		  answers=(HashMap<String, String>) sto.submitExam(stu.get(0).getSid(),que.get(0).getExamid());
		  
		  for (Map.Entry<String,String> entry : answers.entrySet()) {
//			  System.out.println(entry.getKey());
//			  System.out.println(entry.getValue());
			  
			  for(int i=1;i<s1.size();i++) {
				  if (s2.get(i).equals(entry.getValue())) {
					  count++;
					 
				  }
			  }
		  }
		  
		  Student s=stu.get(0);
		  System.out.println(s);
		  s.setMarks(count);
		  System.out.println(s);
		  
		  sto.stuMarks(s);
		  return count;
		 
	 }
		 session.invalidate();
//		 System.out.println(password);
//		 System.out.println(id);
		 return -1;
	 }
}
