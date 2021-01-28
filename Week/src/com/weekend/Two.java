package com.weekend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Two")
public class Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
//		String s1=request.getParameter("s1");
//		String s2=request.getParameter("s2");
		
		HttpSession session=request.getSession(false);
		
//		session.removeAttribute("s1");
		
		String s1=(String)session.getAttribute("s1");
		String s2=(String)session.getAttribute("s2");
		
		
		out.println("second servelet "+s1);
		out.println("second servelet "+s2);
		out.println(session.getId());
//		session.invalidate();  // to end the session
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}