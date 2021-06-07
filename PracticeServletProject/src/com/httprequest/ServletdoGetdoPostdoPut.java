package com.httprequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletdoGetdoPostdoPut
 */
public class ServletdoGetdoPostdoPut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletdoGetdoPostdoPut() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		reportType("doGet", response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		reportType("doPost", response);
	}

	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		reportType("doPut", response);
	}

	public void reportType(String requestType, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");

		// use this to print to browser
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>doGetdoPostdoPutServlet" + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Your Request</h1>");
		out.println("Your request type: " + requestType);
		out.println("</body>");
		out.println("</html>");
	}
}
