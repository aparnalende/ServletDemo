package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySeracher
 */
@WebServlet("/MySeracher")
public class MySeracher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySeracher() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		response.sendRedirect("https://google.co.in/#q="+name);
		// outside server
		//response.sendRedirect("http://www.myexamo.com/");
		//within server
		//response.sendRedirect("index_rd.html");
	}

	

	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		//resp.sendRedirect("https://google.co.in/#q="+name);
		resp.sendRedirect("index_rd.html");
	}*/
	

}
