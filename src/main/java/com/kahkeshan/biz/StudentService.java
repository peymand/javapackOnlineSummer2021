package com.kahkeshan.biz;

import com.kahkeshan.data.StudetORMData;
import com.kahkeshan.data.entities.Student;
import com.kahkeshan.ui.models.StudentDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;

import java.util.List;

public class StudentService {
        StudetORMData data = new StudetORMData();

    public void save(StudentDTO studentDto) throws Exception{


        //mapping  StudentDTO ----> Student

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        Student student =  modelMapper.map(studentDto, Student.class );

        data.save(student);
        //this is my commit
    }

    public List<StudentDTO> getAll() throws Exception {
        StudetORMData data = new StudetORMData();
            List<Student> students  = data.getAll();
        ModelMapper modelMapper = new ModelMapper();

        List<StudentDTO> studentsDTO = null; // students --> studentsDTO
        modelMapper.map(students,studentsDTO);

        return studentsDTO;
    }
}
