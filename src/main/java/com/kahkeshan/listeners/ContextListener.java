package com.kahkeshan.listeners;

import com.kahkeshan.data.StudetORMData;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        StudetORMData studetORMData = new StudetORMData();
        sce.getServletContext().setAttribute("sf",studetORMData.getSessionFactory());
    }
}
