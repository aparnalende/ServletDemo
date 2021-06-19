package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/first", loadOnStartup = 1)
//@WebServlet(urlPatterns= {"/first","/ddd"})
public class First implements Servlet {

	public First() {
		System.out.println("In First constructor" + " called........");

	}

	/*
	 * public First(int aa) {
	 * System.out.println("First para constrocotr called........"); int a = 100;
	 * System.out.println(a); }
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		int b = 200;
		System.out.println(" In first init method called.." + b);

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In sevice method.......");
		PrintWriter out = res.getWriter();
		out.println("<h1>Welcome Java</h1>");

	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "copyright 2007-1010";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("In destroy method........");

	}

}
