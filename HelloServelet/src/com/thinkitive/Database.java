package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Database")
public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Database() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out=response.getWriter();
		 MyDatabaseOperations mb=new MyDatabaseOperations();	
			
		out.println("post method");
		String user=request.getParameter("name");
		int i=Integer.parseInt(user); 
		
		String pass=request.getParameter("pass");
//		mb.insertEmp(i, pass);
//		mb.updateEmp(i, pass);
		mb.deleteEmp(i);
		
	}

}
