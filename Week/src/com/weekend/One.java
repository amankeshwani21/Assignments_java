package com.weekend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/One")
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("first");
		String s2=request.getParameter("second");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("s1", s1);
		session.setAttribute("s2", s2); //sharing data using sessions
		response.sendRedirect("Two");
		
//		out.println(s1+" "+s2);
//		response.sendRedirect("Two?s1="+s1+"&s2="+s2);  URL REwriting
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}