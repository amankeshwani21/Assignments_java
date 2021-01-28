package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/calci")
public class calci extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Calculator c=new Calculator();
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		  int n1=Integer.parseInt(request.getParameter("num1"));
	      int n2=Integer.parseInt(request.getParameter("num2"));
		  int ad=c.add(n1, n2);
		  int ml=c.mul(n1, n2);
		  int dv=c.div(n1, n2);
	      int sb=c.sub(n1, n2);
		  
		  HttpSession session=request.getSession();
		  session.setAttribute("ad", ad);
		  session.setAttribute("sb", sb);
		  session.setAttribute("ml", ml);
		  session.setAttribute("dv", dv);
		  response.sendRedirect("index.jsp");
	}

}
