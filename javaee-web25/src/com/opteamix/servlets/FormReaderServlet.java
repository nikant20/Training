package com.opteamix.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormReaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() is called");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><h2>Hello Servlet</h2></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() is called");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><h2>Hello Servlet</h2></body></html>");
		String password = request.getParameter("pass");
		String[] selectedSkiils = request.getParameterValues("skills");
		String selectedGender = request.getParameter("gender");
		pw.print("<html><body>");
		pw.print("<h3>User Details: </h3>");
		pw.print("<p>Password: "+password+"</p>");
		pw.print("<p>Gender: "+selectedGender+"</p>");
		pw.print("<p>Skills: "+Arrays.toString(selectedSkiils)+"</p>");
		pw.print("</body><html>");
	}

}
