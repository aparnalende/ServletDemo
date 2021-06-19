package com.demo.HttpSessionEvent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		out.print("welcome  "+userName);
		
		HttpSession session=request.getSession();
		session.setAttribute("uname", userName);
		System.out.println("HttpSession= "+session);
		
		ServletContext context=getServletContext();
		System.out.println("ServletContext="+context);
		int total=(Integer) context.getAttribute("totalusers");
		int current=(Integer) context.getAttribute("currentusers");
		
		out.print("<br/> Total users="+total);
		out.print("<br/> current users="+current);
		
		out.print("<br/><a href='LogoutServlet'>Logout</a> ");
		
		
	}

}
