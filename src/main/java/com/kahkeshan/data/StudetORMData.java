package com.kahkeshan.data;

import com.kahkeshan.data.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudetORMData {


    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public StudetORMData(){

        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //Builder Pattern
    }


    public void save(Student student) throws Exception{



            Session session =  sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
            session.close();


    }

    public Student get(int id) throws Exception {


        Session session = sessionFactory.getCurrentSession();
        Student student =  session.get(Student.class, id);
        session.close();

        return student;
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
//        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT_TLB");
//
//        List<Student> students = new ArrayList<>();
//
//        while (rs.next()){
//            Student student = new Student(rs.getString(2),rs.getString(3),rs.getString(1));
//            students.add(student);
//        }
//
//        return students;

    }
    public List<Student> getAll() throws Exception {
        Session session = sessionFactory.getCurrentSession();
        List<Student> students =  session.createQuery("from Student s").list();
        return students;
    }

}
