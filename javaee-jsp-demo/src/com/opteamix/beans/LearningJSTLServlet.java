package com.opteamix.beans;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LearningJSTLServlet")
public class LearningJSTLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user1 = new User("Rahul", 38);
		User user2 = new User("Sehwag",35);
		User user3 = new User("Ganguly", 45);
		
		User[] users = {user1,user2,user3};
		
		HttpSession session = request.getSession();
		session.setAttribute("allUsers", users);
		request.getRequestDispatcher("jstldemo.jsp").forward(request, response);
		
	
	}

}