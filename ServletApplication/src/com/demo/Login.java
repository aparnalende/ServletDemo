package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (password.equals("123")) {
			out.println("<h4> userName or password Correct</h4>");
			System.out.println("In forward() >>>>>>>> ");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		} else {

			out.println("<h4>Sorry userName or password incorrect!!!!! please try again</h4>");
			RequestDispatcher rd = request.getRequestDispatcher("index_rd.html");
			rd.include(request, response);
			// request.getRequestDispatcher("index_rd.html").include(request, response);
			System.out.println("In include()....................");
			// request.getRequestDispatcher("WelcomeServlet").include(request, response);

		}

	}

}
