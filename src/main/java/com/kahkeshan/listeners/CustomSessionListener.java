package com.kahkeshan.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class CustomSessionListener implements HttpSessionListener {

    public static int counter = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session is created: " + se.getSession().getId());
        counter++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session is destroyed: " + se.getSession().getId());
        counter--;

    }
}
