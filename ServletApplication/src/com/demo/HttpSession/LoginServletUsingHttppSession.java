package com.demo.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServletUsingHttppSession
 */
@WebServlet("/LoginServletUsingHttppSession")
public class LoginServletUsingHttppSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletUsingHttppSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		request.getRequestDispatcher("links_https.html").include(request, response);
		if(password.equals("123")) {
			out.println("you are successfully logged in!!!");
			out.println("<br> Welcome "+userName);
			HttpSession session=request.getSession();
			session.setAttribute("uname", userName);
			
		}else {
			out.println("Sorry username or password error!! please try again...");
			request.getRequestDispatcher("login_httpSession.html").include(request, response);
			
		}
	}

}
