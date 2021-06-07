package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * Application Lifecycle Listener implementation class ExampleAttributeListener
 *
 */
public class ExampleAttributeListener implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public ExampleAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
//        System.out.println("A new requested attribute is removed");
//        System.out.println("Name of this attribute : "+srae.getName());
//        System.out.println("value of this attribute : "+srae.getValue());
//        System.out.println();
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
//    	System.out.println("A new request attribute is added");
//    	System.out.println("Name of this attribute " + srae.getName());
//    
//    	System.out.println("Value of this attribute " + srae.getValue());
//    	System.out.println();
    	
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
//       System.out.println("A requested attribute replaced.");
//       System.out.println("Name of this attribute: "+srae.getName());
//       System.out.println("Value of this attribute "+srae.getValue());
//   
//  
    
    }
	
}
