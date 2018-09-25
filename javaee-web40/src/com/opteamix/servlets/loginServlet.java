package com.opteamix.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user");
		String password = request.getParameter("password");
		
		if(username.equals("Admin") && password.equals("Opteamix")) {
			RequestDispatcher success = request.getRequestDispatcher("success.html");
			success.forward(request, response);
		}else {
			RequestDispatcher failure = request.getRequestDispatcher("failure.html");
			RequestDispatcher login = request.getRequestDispatcher("index.html");
			failure.include(request, response);
			login.include(request, response);
		}
	}

}
