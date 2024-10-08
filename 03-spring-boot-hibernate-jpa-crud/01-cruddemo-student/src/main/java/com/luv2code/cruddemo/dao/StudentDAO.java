package com.luv2code.cruddemo.dao;

import java.util.List;

import com.luv2code.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student thestudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void updateStudent(Student theStudent);

    void delete(Integer id);
}
