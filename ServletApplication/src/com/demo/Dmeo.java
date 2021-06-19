package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dmeo
 */
@WebServlet("/Dmeo")
public class Dmeo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dmeo() {
		System.out.println("In Demo const called.....");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("In Demo init method......");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In doGet method.....");
		doPost(request, response);
	}

	/*
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { // TODO Auto-generated method
	 * stub //super.service(req, resp); //doPost(req, resp); }
	 */

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In doPost method....");
		// doGet(req, resp);

	}

}
