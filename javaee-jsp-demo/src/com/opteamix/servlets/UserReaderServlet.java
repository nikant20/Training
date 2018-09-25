package com.opteamix.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opteamix.beans.User;


@WebServlet("/UserReaderServlet")
public class UserReaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("un");
		int age = Integer.parseInt(request.getParameter("age"));
		User user = new User(name, age);
		request.setAttribute("userKey", user);//stores user object in request scope
		
		User user2 = new User("Zaheer",35);
		HttpSession session = request.getSession();
		session.setAttribute("userKey2", user2);//stores user object in session scope
		
		User user3 = new User("Sachin", 45);
		ServletContext application = getServletContext();
		application.setAttribute("userKey3", user3); //stores users object in application scope
		
		request.getRequestDispatcher("first.jsp").forward(request, response);
		
	}

}
