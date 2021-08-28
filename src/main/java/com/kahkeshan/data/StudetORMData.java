package com.kahkeshan.data;

import com.kahkeshan.data.entities.Profile;
import com.kahkeshan.data.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class StudetORMData {


    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public StudetORMData(){
        //Builder Pattern
    }


    public void save(Student student) throws Exception{
//            sessionFactory.getCurrentSession().getTransaction().begin();
            sessionFactory.getCurrentSession().save(student);
//            sessionFactory.getCurrentSession().getTransaction().commit();
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
