package com.kahkeshan.data;

import com.kahkeshan.ui.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentData {


    public void save(Student student) throws Exception{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
            PreparedStatement ps = connection.prepareStatement("INSERT INTO student_tlb (college, first_name, last_name) VALUES (?, ?, ?)");
            ps.setString(2,student.getName());
            ps.setString(3,student.getFamily());
            ps.setString(1,student.getCollege());
            ps.executeUpdate();

    }

    public List<Student> getAll() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT_TLB");

        List<Student> students = new ArrayList<>();

        while (rs.next()){
            Student student = new Student(rs.getString(2),rs.getString(3),rs.getString(1));
            students.add(student);
        }

        return students;

    }
}
