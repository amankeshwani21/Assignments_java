package com.cal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyClass {
	@Autowired
	Calculator c;
	
	@RequestMapping(value = "/calculate",method=RequestMethod.GET)
	public ModelAndView hello(String n1, String n2) {
		System.out.println("Hello world");
		

		ModelAndView model =new ModelAndView();

		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		
		int addition=c.add(num1, num2);
    
    	model.addObject("message", "welcome--!! ");
    	model.addObject("addition", addition);
	    model.setViewName("result.jsp");
		
		return model;
//		return "welcome.jsp";
	}

}
