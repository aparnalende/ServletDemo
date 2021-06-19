package com.demo.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("/FilterDemo")
public class FirstFilter implements Filter {

	static int count=0;
    /**
     * Default constructor. 
     */
    public FirstFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in filter destroy method.....");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("filter is called before first filter <br/>");
		// pass the request along the filter chain
		long before=System.currentTimeMillis();
		chain.doFilter(request, response);
		long after=System.currentTimeMillis();
		out.println("<br/> total visitor "+(++count));
		out.println("<br/> total response time "+(after-before)+"miliseconds");
		
		out.println("filter is called after first filter <br/>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in filter init method.....");
	}

}
