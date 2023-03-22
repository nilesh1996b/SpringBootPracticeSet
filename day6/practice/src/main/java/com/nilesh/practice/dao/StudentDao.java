package com.nilesh.practice.dao;

import com.nilesh.practice.entity.Student;

import java.util.List;

public interface StudentDao {

    void save(Student student);
    Student getStudentById(int id);

    List<Student> getAllStudent(String lastName);


}
