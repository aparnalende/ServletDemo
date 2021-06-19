package com.demo.servlet.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletCoockie
 */
public class MyServletCoockie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServletCoockie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("user");
		String pass=request.getParameter("password");
		
		if(pass.equalsIgnoreCase("1234"))
		{
			Cookie ck=new Cookie("user",name);
			response.addCookie(ck);
			response.sendRedirect("First");
		}
	}

}
