package pl.akademiakodu.api;


import java.util.List;

public interface StudentDao{

    void addStudent(Student student);
    List<Student> findAll();

}
