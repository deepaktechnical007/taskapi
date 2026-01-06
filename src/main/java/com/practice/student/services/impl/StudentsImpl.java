package com.practice.student.services.impl;

import com.practice.student.data.student.CreateStudentRequest;
import com.practice.student.services.Students;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsImpl implements Students {


    @Override
    public ResponseEntity<String> createStudent(CreateStudentRequest createStudentRequest) {
        System.out.println("this is StudentsImpl --> createStudent()");

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Student Created");
    }

    @Override
    public ResponseEntity<String> updateStudent() {
        System.out.println("this is StudentsImpl --> updateStudent()");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Student Updated");
    }

    @Override
    public ResponseEntity<String> deleteStudent(String email, String mobile, String password) {
        System.out.println("this is StudentsImpl --> deleteStudent()");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Student Deleted");
    }

    @Override
    public ResponseEntity<List<Students>> getAllStudent() {
        System.out.println("this is StudentsImpl --> getAllStudent()");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @Override
    public ResponseEntity<Students> getStuedentById(Long Id) {
        System.out.println("this is StudentsImpl --> getStudentById()");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }


}

