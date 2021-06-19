package com.demo.ServletConfingAndServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AttributeScope
 */
@WebServlet("/AttributeScope")
public class AttributeScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttributeScope() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.setAttribute("Sname","TQPP");
		
		out.println("<a href=AttributeScope2>Click Here</a>");
		// request scope
		/*String name =(String) request.getAttribute("Sname");
		out.println(name);*/
		
		//request.getRequestDispatcher("AttributeScope2").include(request, response);
		
		// session scope
	/*HttpSession session	=request.getSession();
	session.setAttribute("name","TQDP");*/
		
	// application scope
	ServletContext context=getServletContext();
	context.setAttribute("name", "online-mar-Batch");
	}

}
