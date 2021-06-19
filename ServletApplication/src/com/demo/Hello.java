package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet(urlPatterns="/Hello",loadOnStartup=0)
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
       // super();
        // TODO Auto-generated constructor stub
    	int i=20;
    	System.out.println("Hello const called...."+i);
    }
    public void destroy() {
		System.out.println("In Hello destroy method called.......");
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("In Hello init method called.....");
	}
    

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In hello service method called....");
		PrintWriter out=resp.getWriter();
		out.println("<b>in service method</b>");
		//super.service(req, resp);
		//doGet(req,resp);
		doPost(req,resp);
		System.out.println("out hello service method");
	}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In DoGet Method.......");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("hello");
		response.getWriter().println("<h1>How are you</h1>");
		//doPost(request,response);
		//service(request, response);
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In DoPost method....");
		response.getWriter().println("<h1>Hello dopost</h1>");
		
		doGet(request, response);
		System.out.println("out post mehtod.....");
		
	}

}
