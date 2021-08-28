package com.kahkeshan.util;

import com.kahkeshan.data.entities.Student;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/dispatcher-servlet.xml");
        SessionFactory factory = (SessionFactory) context.getBean("sf");
        factory.getCurrentSession().save(new Student("1","1","1",null));

    }

}
