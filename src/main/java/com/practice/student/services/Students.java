package com.practice.student.services;

import com.practice.student.data.student.CreateStudentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Students {
    public ResponseEntity<String> createStudent(CreateStudentRequest createStudentRequest);
    public ResponseEntity<String> updateStudent();
    public ResponseEntity<String> deleteStudent(String email, String mobile, String password);
    public ResponseEntity<List<Students>> getAllStudent();
    public ResponseEntity<Students> getStuedentById(Long Id);
}
