package com.MyProject.MainPro.Service;

import com.MyProject.MainPro.Model.Student;
import com.MyProject.MainPro.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getAllStudents()
    {
        List<Student> students=new ArrayList<>();
         studentRepository.findAll().forEach(students::add);
         return students;
    }

    public void addStudent(Student student)
    {
        studentRepository.save(student);
    }

    public void updateStudent(Student student)
    {
        studentRepository.save(student);
    }

    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);

    }
}
