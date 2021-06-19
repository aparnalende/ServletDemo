package com.demo.ServletContextEvent;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {
	//Connection conn=null;
    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
       System.out.println("in contextDestroyed.......");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
    	 try {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
 			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
 			ServletContext context=event.getServletContext();
 			context.setAttribute("myconn", conn);
 			System.out.println("connection= "+conn);
         	
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
    }
	
}
