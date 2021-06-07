package com.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewRegisterServlet
 */
public class NewRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		
		User u=new User();
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setMobile(mobile);
		u.setEmail(email);
		u.setUname(uname);
		u.setPassword(password);
		u.setAge(age);
		
		int status=UserDao.save(u);  
		System.out.println(status);
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            System.out.println(status);
            request.getRequestDispatcher("login.html").forward(request, response);
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
		
	}

}
