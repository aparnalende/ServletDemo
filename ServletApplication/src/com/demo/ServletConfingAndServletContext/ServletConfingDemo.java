package com.demo.ServletConfingAndServletContext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfingDemo
 */
// @WebServlet("/ServletConfingDemo")
public class ServletConfingDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletConfingDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("hello");
		ServletConfig config = getServletConfig();
		System.out.println("servlet config demo = "+config);
		/*
		 * String userName=config.getInitParameter("username");
		 * out.println("userName="+userName); String
		 * password=config.getInitParameter("password");
		 * out.println("password="+password);
		 */

		Enumeration<String> e = config.getInitParameterNames();
		String str = "";
		while (e.hasMoreElements()) {
		str =  e.nextElement();
		out.println(config.getInitParameter(str));

		}

	}

}
