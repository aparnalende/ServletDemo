package com.demo.HttpSessionEvent;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountUserListener
 *
 */
@WebListener
public class CountUserListener implements HttpSessionListener {

    ServletContext context=null;
    static int total=0,current=0;
    public void sessionCreated(HttpSessionEvent event)  { 
    	total++;
    	current++;
    	context=event.getSession().getServletContext();
    	context.setAttribute("totalusers", total);
    	context.setAttribute("currentusers", current);
    	System.out.println("in CountUserListener  sessionCreated method.......");
    	
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	current--;
    	context.setAttribute("currentusers", current);
    }
	
}
