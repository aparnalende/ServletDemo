package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class UsernameFilter
 */
public class UsernameFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UsernameFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		response.setContentType("text/html");
		System.out.println("in preprocessing of username filter");
		String str=request.getParameter("username");
		if(str.equals("abc@123"))
		{
			chain.doFilter(request, response);
			System.out.println("in post processing of usernamefilter");
		} 
		else
		{
			PrintWriter pw=response.getWriter();
			pw.println(" <h3 style='color:red;'> Please re-renter username</h3>");
			request.getRequestDispatcher("index.html").include(request, response);
		}	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init of UsernameFilter ");
		
	}

}
