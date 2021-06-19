package com.demo.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionCounter
 *
 */
public class MySessionCounter implements HttpSessionListener {
	
	private static int sessionCount; 
    /**
     * Default constructor. 
     */
    public MySessionCounter() {
        // TODO Auto-generated constructor stub
    }

    
    public int getActiveSession()
    {
        return sessionCount;
    }
   
	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	sessionCount++;
    	System.out.println(sessionCount);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	sessionCount--;
    	System.out.println(sessionCount);
    }
	
}
