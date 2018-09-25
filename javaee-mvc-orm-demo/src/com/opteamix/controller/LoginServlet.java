package com.opteamix.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;

import com.opteamix.beans.UserProfile;
import com.opteamix.dao.UserProfileDAO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserProfileDAO dao = new UserProfileDAO();
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		UserProfile userValidation  = dao.authenticate(username, password);
		if (userValidation != null) {
			
			request.setAttribute("userDetails", userValidation);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else {
			RequestDispatcher failure = request.getRequestDispatcher("failure.html");
			RequestDispatcher login = request.getRequestDispatcher("login.html");
			failure.include(request, response);
			login.include(request, response);
		}
	}

}
