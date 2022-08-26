package com.MyProject.MainPro.Controller;

import com.MyProject.MainPro.Model.Student;
import com.MyProject.MainPro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/student")
    public List<Student> getAllStudents(){

      return  studentService.getAllStudents();

    }

    @RequestMapping(method = RequestMethod.POST,value = "/student/create")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);

    }

    @RequestMapping(method = RequestMethod.PUT,value = "/student/update/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student){
        studentService.updateStudent(student);

    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/student/delete/{id}")
    public void deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
    }



}
