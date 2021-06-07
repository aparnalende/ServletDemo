package com.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class AttributeHttpSessionListener
 *
 */
public class AttributeHttpSessionListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public AttributeHttpSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
       String attributeName=se.getName();
       Object attributeValue=se.getValue();
       
       System.out.println("Attribute added : " + attributeName + " : " + attributeValue);
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	String attributeName = se.getName();
        Object attributeValue = se.getValue();
        System.out.println("Attribute removed : " + attributeName + " : " + attributeValue);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	String attributeName = se.getName();
        Object attributeValue = se.getValue();
        System.out.println("Attribute replaced: " + attributeName + " : " + attributeValue);
    }
	
}
