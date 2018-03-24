package com.example.demo.service;

import java.util.List;

import com.example.demo.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);


    List<StudentModel> selectAllStudents ();


    boolean addStudent (StudentModel student);


    boolean deleteStudent (String npm);


	boolean updateStudent(StudentModel student);
}
