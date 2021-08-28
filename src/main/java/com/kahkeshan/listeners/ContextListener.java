package com.kahkeshan.listeners;

import com.kahkeshan.conf.SpringContextConfig;
import com.kahkeshan.data.StudetORMData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


public class ContextListener implements ServletContextListener {
//    public static ApplicationContext ap;
//    static {
//          ap = new AnnotationConfigApplicationContext(SpringContextConfig.class);
//    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {


    }
}
