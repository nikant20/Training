package com.opteamix.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("n1");
		String email = request.getParameter("n2");
		pw.println("<html><body>");
		pw.print("<p>Hello "+name+", Your email di is:  "+email+"</p>");
		pw.println("</body></html>");
		
		HttpSession session = request.getSession();
		//store name and email in session
		session.setAttribute("s1", name);
		session.setAttribute("s2", email);
		
		pw.print("<p>Session is new :"+session.isNew()+"</p>");
		pw.print("<p>Session id: "+session.getId()+"</p>");
		
		pw.print("");
		
		request.getRequestDispatcher("address.html").include(request, response);
		
	}

}
