package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Hello")
public class Hello extends HttpServlet {
	int count=0;
	private static final long serialVersionUID = 1L;
       
  
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
//		out.println("get method");
//		
//		String user=request.getParameter("name");
//		String pass=request.getParameter("pass");
//		out.println(user+" "+pass);
		
		String num=request.getParameter("name");
		int i=Integer.parseInt(num); 
		
		int fact=1;
		for(int j=1;j<=i;j++){
			fact=fact*j;
		}
		out.println(fact);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
      PrintWriter out=response.getWriter();
		
		
		out.println("post method");
		
//		String user=request.getParameter("name");
//		String pass=request.getParameter("pass");
//		out.println(user+" "+pass);
		
		String num=request.getParameter("name");
		int i=Integer.parseInt(num); 
		out.println(fact(i));
		
	}
	
	
	public int fact(int n){
		int fact=1;
		for(int j=1;j<=n;j++){
			fact=fact*j;
		}
		return fact;
		
	}
	
	@Override
	public void destroy() {
		
		super.destroy();
	}

}
