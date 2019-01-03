package pl.akademiakodu.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.api.Student;
import pl.akademiakodu.api.StudentDao;

import java.util.List;

@RequestMapping("/api/students")
@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

//    student = new studentDaoImpl();

    @GetMapping("")
    public List<Student> findAll(){
        return studentDao.findAll();
    }

    @PostMapping("")
    public Student add(@ModelAttribute Student student){
        studentDao.addStudent(student);
        return student;
    }

}


