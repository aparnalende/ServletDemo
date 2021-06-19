package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GetCookieServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Cookie ck[]=request.getCookies();
		for(Cookie c:ck) {
			pw.println("<h2>Cookie Name : "+c.getName()+"</h2>");
			pw.println("<h2>"+c.getValue()+"</h2>");
		}
	}

	

}
