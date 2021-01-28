package com.thinkitive;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Myclass extends TagSupport {
	
    private String message;
    
    private String number;
    
   
    public String getMessage() {
		return message;
	}
    
    public void setMessage(String message) {
  		this.message = message;
  	}
    
    public void setNumber(String number) {
		this.number = number;
	}
    
    public String getNumber() {
		return number;
	}
    
    private int facto(String x){
    	int fact=1;
    	for(int i=1;i<=Integer.parseInt(x);i++){
    		fact=fact*i;
    	}
		return fact; 	
    }
    
  
	@Override
	public int doStartTag() throws JspException {
		JspWriter out=pageContext.getOut();
		
		try {
			out.println("hello world...! "+facto(number));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
