package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
   public static void main(String[] args) {
	   ApplicationContext cont=new ClassPathXmlApplicationContext("anyname.xml");
		Employee e =cont.getBean(Employee.class);
		System.out.println(e);
		e.gsalary();
		e.nsalary();
		System.out.println(e);
}
}
