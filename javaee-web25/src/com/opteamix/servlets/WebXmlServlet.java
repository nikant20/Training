package com.opteamix.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebXmlServlet
 */
public class WebXmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<p>This is First Servlet</p>");
		ServletConfig servletConfig = getServletConfig();
		ServletContext servletContext = servletConfig.getServletContext();
		//to read <init-param>
		String username = servletConfig.getInitParameter("user");
		String password = servletConfig.getInitParameter("pass");
		//to read <context-param>
		String companyName = servletContext.getInitParameter("company");
		printWriter.print("<p>Username: "+username+", Password ="+password+", Company = "+companyName+"</p>");
		printWriter.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
