package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServeletTwo")
public class ServeletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ServeletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("we are in servelet two");
		
		String user=(String) request.getAttribute("user");
		String pass=(String) request.getAttribute("pass");
		out.println(user+" "+pass);
	}

}
