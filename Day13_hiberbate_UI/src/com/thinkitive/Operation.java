package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Operation")
public class Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		MyDbConnection d=new MyDbConnection();
		
		
		int id=Integer.parseInt(request.getParameter("empid"));
		String name=request.getParameter("empname");
	
		int sal=Integer.parseInt(request.getParameter("empsal"));
//		d.insertEmployee(id,name,sal);
		d.updateEmployee(id,name,sal);
	}

}
