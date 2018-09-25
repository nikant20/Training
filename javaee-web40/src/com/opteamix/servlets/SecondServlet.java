package com.opteamix.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("n1");
		String email = request.getParameter("n2");
		pw.println("<html><body>");
		pw.print("<p>Hello "+name+", Your email id is:  "+email+"</p>");
		String state = request.getParameter("n3");
		String city = request.getParameter("n4");
		
		HttpSession session = request.getSession();
		String nameInSession = (String)session.getAttribute("s1");
		String emailInSession = (String)session.getAttribute("s2");
		
		pw.print("<p>Session is new :"+session.isNew()+"</p>");
		pw.print("<p>Session id: "+session.getId()+"</p>");
		
		pw.print("<p>Name from session: "+nameInSession+"</p>");
		pw.print("<p>Email from session: "+emailInSession+"</p>");
		
		pw.print("<p>Address is: "+state+", "+city+"</p>");
		pw.println("</body></html>");
	}

}
