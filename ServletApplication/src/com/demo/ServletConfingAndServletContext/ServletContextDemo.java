package com.demo.ServletConfingAndServletContext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextDemo
 */
@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*ServletContext context=getServletContext();
	String username	=context.getInitParameter("username");
	out.println("userName="+username);*/
		
	ServletContext context=getServletConfig().getServletContext();
	System.out.println("servletContextDemo= "+context);
	Enumeration<String> e = context.getInitParameterNames();
	String str = "";
	while (e.hasMoreElements()) {
	str =  e.nextElement();
	out.println(context.getInitParameter(str));

	}

	
		
	}

}
