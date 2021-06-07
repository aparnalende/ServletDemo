package com.servlet.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstAttributeServlet
 */
public class FirstAttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstAttributeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getServletContext().setAttribute("name", "Application scoped attribute");
		
		HttpSession session=request.getSession();
		session.setAttribute("name", "session scoped attribute");
		
		request.setAttribute("name", "request scoped attribute");
		
		RequestDispatcher rd=request.getRequestDispatcher("SecondAttributeServlet");
		rd.forward(request, response);

	}

}
