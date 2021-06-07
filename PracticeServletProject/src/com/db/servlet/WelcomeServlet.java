package com.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h2 color='red'>WELCOME TO THE HOME PAGE!!!!!!!!!!</h2>");
		
		HttpSession session=request.getSession();
		System.out.println("WelcomeServlet sessionId :"+session);
		String str=(String) session.getAttribute("user");
//		pw.println("<h2>"+str+"</h2>");
		System.out.println("\nSession Id : "+session.getId());
//		
//		ServletContext ctx=getServletContext();
//		pw.println(ctx.getAttribute("name"));
//		
//		Cookie[] cookie=request.getCookies();
//		for(Cookie ck:cookie) {
//			System.out.println("\nCookie name : "+ck.getName()+" \tCookie value: "+ck.getValue());
//		}
		
		pw.println("<a href='LogoutServlet'>Logout</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
