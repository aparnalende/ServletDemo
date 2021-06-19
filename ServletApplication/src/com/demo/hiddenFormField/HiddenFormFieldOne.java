package com.demo.hiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFormFieldOne
 */
@WebServlet("/HiddenFormFieldOne")
public class HiddenFormFieldOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenFormFieldOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("username");
		out.println("Welcome  "+ userName);
		// form submit button
				out.print("<form action='HiddenFormFieldTwo'> ");
				out.print("<input type='hidden' name='uname' value='"+userName+"'>");
				out.print("<input type='submit' value='go'>");
				
				out.print("</form>");
				
	}

}
