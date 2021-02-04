package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	Employee e;
	
	@Autowired
	DbOperations db;
   
	@RequestMapping(value = "/details")
	public ModelAndView emp(int id, String name, int sal) {
		
		ModelAndView model=new ModelAndView();
		
		e.setId(id);
		e.setEname(name);
		e.setSalary(sal);
		
		db.add(e);
    
	    model.setViewName("index.jsp");
		
		return model;
		
	}
}
