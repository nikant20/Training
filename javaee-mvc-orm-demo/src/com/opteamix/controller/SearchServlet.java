package com.opteamix.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opteamix.beans.UserProfile;
import com.opteamix.dao.UserProfileDAO;


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserProfileDAO dao = new UserProfileDAO();
		UserProfile profile =  dao.findByphoneNumber(request.getParameter("phoneNumber"));
		request.setAttribute("userProfile", profile);
		request.getRequestDispatcher("Details.jsp").forward(request, response);;
	}

}
