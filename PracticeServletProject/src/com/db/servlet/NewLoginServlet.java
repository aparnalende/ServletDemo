package com.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NewLoginServlet
 */
public class NewLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String luname, lpass;

	public NewLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//		User u=new User();	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");

		//		ServletContext ctx = getServletContext();
		//		ctx.setAttribute("name", "Aparna");

		Connection con = UserDao.getConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select uname,pass from user where uname=? and pass=?");
			ps.setString(1, uname);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				luname = rs.getString(1);
				lpass = rs.getString(2);
			}

			if (uname.equalsIgnoreCase(luname) && password.equalsIgnoreCase(lpass)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", uname);
				RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
				rd.include(request, response);
				System.out.println("NewLoginServlet sessionId: " + session);
//				Cookie[] cookie = request.getCookies();
//				for (Cookie ck : cookie) {
//					System.out.println("Cookie name : " + ck.getName() + " \tCookie value: " + ck.getValue());
//				}
//				System.out.println(response.encodeURL("WelcomeServlet"));

//				response.sendRedirect("WelcomeServlet");

			} else {
				out.print("<p style='position:absolute;top:25 0px;left:300px;color:red;font-style:bold;font-size:30px;'>Sorry username or password incorrect! </p>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//	     
	}

}
