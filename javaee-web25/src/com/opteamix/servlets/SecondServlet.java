package com.opteamix.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("n1");
		String email = request.getParameter("n2");
		pw.println("<html><body>");
		pw.print("<p>Hello "+name+", Your email di is:  "+email+"</p>");
		String state = request.getParameter("n3");
		String city = request.getParameter("n4");
		
		pw.print("<p>Address is: "+state+", "+city+"</p>");
		pw.println("</body></html>");
	}

}
