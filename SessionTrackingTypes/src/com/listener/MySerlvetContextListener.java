package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MySerlvetContextListener
 *
 */
public class MySerlvetContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MySerlvetContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("Servlet context is destoryed");
    	
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("Servlet Context is initialized ");
    	ServletContext ctx=sce.getServletContext();
    	ctx.setAttribute("counter", 0);
    	
    }
	
}
