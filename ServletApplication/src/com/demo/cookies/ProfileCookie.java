package com.demo.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileCookie
 */
@WebServlet("/ProfileCookie")
public class ProfileCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProfileCookie() {
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
		request.getRequestDispatcher("linkcookie.html").include(request, response);
		Cookie ck[] = request.getCookies();
		if (ck != null) {
			String name = ck[0].getValue();
			if (!name.equals("") || name != null) {
				out.println("Welcome to profile");
				out.println("Welcome  " + name);
			}

		} else {
			out.print("Please login first...");
			request.getRequestDispatcher("loginCookie.html").include(request, response);
		}
		out.close();

	}

}
