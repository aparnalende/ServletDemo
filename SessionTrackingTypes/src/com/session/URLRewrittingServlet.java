package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URLRewrittingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public URLRewrittingServlet() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		ArrayList<String> emparr=new ArrayList<>();
		emparr.add("Aparna");
		emparr.add("Rupali");
		emparr.add("Shubha");
		for(String s:emparr)
		{
			pw.println("<h2><a href='EmpDetailServlet?ename="+s+"'>"+s+"</a></h2>");
		
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
