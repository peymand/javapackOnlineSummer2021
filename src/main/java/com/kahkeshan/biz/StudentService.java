package com.kahkeshan.biz;

import com.kahkeshan.data.StudentData;
import com.kahkeshan.data.StudetORMData;
import com.kahkeshan.ui.models.Student;

import java.util.List;

public class StudentService {


    public void save(Student student) throws Exception{
        StudetORMData data = new StudetORMData();

        data.save(student);
    }

    public List<Student> getAll() throws Exception {
        StudetORMData data = new StudetORMData();

        return data.getAll();
    }
}
