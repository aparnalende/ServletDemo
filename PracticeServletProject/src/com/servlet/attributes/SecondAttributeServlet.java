package com.servlet.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondAttributeServlet
 */
public class SecondAttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondAttributeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		//application scope attribute
		String applicationScope=(String) request.getServletContext().getAttribute("name");

		//httpSession attribute
		HttpSession session=request.getSession();
		String sessionScope=(String) session.getAttribute("name");

		//requestScope attribute
		String requestScope=(String) request.getAttribute("name");


		out.write("<html><body>");
		out.write("<h2>Servlet attributes example: applicationScope, sessionScope and requestScope</h2>");
		out.write("<p>applicationScope: " + applicationScope + "</p>");
		out.write("<p>sessionScope: " + sessionScope + "</p>");
		out.write("<p>requestScope: " + requestScope + "</p>");
		if(session != null) {
			session.removeAttribute("name");}
	}

}
