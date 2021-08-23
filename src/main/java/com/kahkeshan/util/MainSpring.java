package com.kahkeshan.util;

import com.kahkeshan.data.entities.Student;
import com.kahkeshan.ui.models.StudentDTO;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory factory = (SessionFactory) context.getBean("sf");
        factory.getCurrentSession().save(new Student("1","1","1",null));

    }

}
