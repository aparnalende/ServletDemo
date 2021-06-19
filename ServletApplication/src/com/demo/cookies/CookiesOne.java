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
 * Servlet implementation class CookiesOne
 */
@WebServlet("/CookiesOne")
public class CookiesOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesOne() {
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
		out.println("Welcome "+userName);
		//create cookies object
		Cookie ck=new Cookie("uName",userName);
		//adding cookies in response
		response.addCookie(ck);
		
		// form submit button
		out.print("<form action='CookiesTwo' method='post'>");
		out.print("<input type='submit' value='go'>");
		
		out.print("</form>");
		
		out.close();
	}

}
