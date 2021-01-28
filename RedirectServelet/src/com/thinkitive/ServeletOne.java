package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServeletOne")
public class ServeletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		out.println("we are in servelet one");
		
		String user=request.getParameter("name");
		String pass=request.getParameter("pass");
		out.println(user+" "+pass);
//		response.sendRedirect("ServeletTwo");
		
		request.setAttribute("user", user);
		
		request.setAttribute("pass", pass);
		
		RequestDispatcher d=request.getRequestDispatcher("ServeletTwo");
//     	d.forward(request, response);
		d.include(request, response);
	}

}
