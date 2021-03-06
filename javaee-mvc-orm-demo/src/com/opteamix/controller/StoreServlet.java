package com.opteamix.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opteamix.beans.UserProfile;
import com.opteamix.dao.UserProfileDAO;
import com.opteamix.dao.UserProfileOperations;


@WebServlet("/StoreServlet")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<UserProfile> list = null;
		UserProfileOperations daooperations = new UserProfileDAO();
		list = daooperations.getAllUsers();
		req.setAttribute("listKey", list);
		req.getRequestDispatcher("showusers.jsp").forward(req, resp);
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String phoneNumber = request.getParameter("phoneNumber");
		UserProfile userProfile = new UserProfile(userName, password, gender, phoneNumber);
		UserProfileOperations daooperations = new UserProfileDAO();
		int status = daooperations.store(userProfile);
		if(status > 0) {
			request.setAttribute("userKey", userProfile);
			request.getRequestDispatcher("registrationSuccess.jsp").forward(request, response);
		}else {
			request.setAttribute("error", "Sorry User is not stored");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
	
}
