package com.demo.ServletConfingAndServletContext;

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
 * Servlet implementation class AttributeScope2
 */
@WebServlet("/AttributeScope2")
public class AttributeScope2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttributeScope2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>In AttributeScope2 .......</h3>");
		//request scope
		/*String name =(String) request.getAttribute("Sname");
		out.println(name);*/
		
		//session scope
	/*	HttpSession session	=request.getSession();
		String sessionScope=(String) session.getAttribute("name");
		out.println(sessionScope)*/;
		
		
		//Application scope
		ServletContext context=getServletContext();
		String applicationScope=(String) context.getAttribute("name");
		out.println(applicationScope);
		
		
		
	}

}
