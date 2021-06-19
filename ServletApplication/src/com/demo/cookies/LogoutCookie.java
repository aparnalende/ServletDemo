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
 * Servlet implementation class LogoutCookie
 */
@WebServlet("/LogoutCookie")
public class LogoutCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	 request.getRequestDispatcher("linkcookie.html").include(request, response);
	 
	 Cookie ck[]=request.getCookies();
	 if(ck!=null) {
		 Cookie ck1=new Cookie("name","");
		 ck1.setMaxAge(0);
		 response.addCookie(ck1);
		 out.println("You are successfully logged out....");
		 
	 }else {
		 out.print("Please login first...");
		 request.getRequestDispatcher("loginCookie.html").include(request, response);
	 }
	 
	
	 //request.getRequestDispatcher("loginCookie.html").include(request, response);
	}

}
