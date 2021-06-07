package com.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCounterListener
 *
 */
public class SessionCounterListener implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
//	private static int totalActiveSessions;

	public SessionCounterListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();

		System.out.println("......In session created.....with Id...." + session.getId());
		;
		session.setMaxInactiveInterval(5);
		session.setAttribute("Name", "Counter listener");

	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("\n.............Session Destroyed............");
	}

}
