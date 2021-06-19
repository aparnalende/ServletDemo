package com.demo.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileHttpSessionServlet
 */
@WebServlet("/ProfileHttpSessionServlet")
public class ProfileHttpSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileHttpSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("links_https.html").include(request, response);
		HttpSession session=request.getSession(false);
		if(session!=null) {
			String username=(String) session.getAttribute("uname");
			out.println("Hello  "+username +"  "+"Welcome to profile");
			
		}else {
			out.println("Please login first.....");
			request.getRequestDispatcher("login_httpSession.html").include(request, response);
			
		}
	}

}
