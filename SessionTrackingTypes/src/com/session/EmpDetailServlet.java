package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmpDetailServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String str=request.getParameter("ename");
		pw.println("<h1>Emp Details</h1>");
		if(str.equals("Aparna")) {
			pw.println("<h3>"+str+" is a Student</h3>");
		}
		else
			if(str.equals("Rupali")) {
				pw.println("<h3>"+str+" is a Trainer</h3>");
			}
			else
				if(str.equals("Shubha")) {
					pw.println("<h3>"+str+" is a Coordinator</h3>");
				}
		pw.print("<h3><a href='URLRewrittingServlet'>Back</a></h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
