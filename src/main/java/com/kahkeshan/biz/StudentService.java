package com.kahkeshan.biz;

import com.kahkeshan.data.StudetORMData;
import com.kahkeshan.data.entities.Student;
import com.kahkeshan.ui.models.StudentDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudetORMData data;

    @Autowired
    ModelMapper modelMapper;

    public void save(StudentDTO studentDto) throws Exception {


        //mapping  StudentDTO ----> Student


        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        Student student = modelMapper.map(studentDto, Student.class);

        data.save(student);
        //this is my commit
    }

    public List<StudentDTO> getAll() throws Exception {

        List<Student> students = data.getAll();
        ModelMapper modelMapper = new ModelMapper();

        List<StudentDTO> studentsDTO = new ArrayList<>(); // students --> studentsDTO
        modelMapper.map(students, studentsDTO);

        return studentsDTO;
    }
}
