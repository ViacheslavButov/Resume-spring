package com.epam.resume.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileController extends HttpServlet{
	private static final long serialVersionUID = -1961434718891521031L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getServletPath());
		System.out.println(req.getServletContext().getServerInfo());
		req.getRequestDispatcher("/WEB-INF/JSP/profile.jsp").forward(req, resp);;
	}
}
