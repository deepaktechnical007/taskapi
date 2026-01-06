package com.practice.student.controller;

import com.practice.student.data.student.CreateStudentRequest;
import com.practice.student.data.student.Student;
import com.practice.student.services.Students;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {

    private final Students students;

    @GetMapping
    public ResponseEntity<List<Students>> getAllStudent() {
        System.out.println("this is StudentController --> getAllStudent()");
        ResponseEntity<List<Students>> response = students.getAllStudent();
        return response;
    }


    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody CreateStudentRequest createStudentRequest){
        System.out.println("this is UserController --> createStudent()");
        ResponseEntity<String> response = students.createStudent(createStudentRequest);
        return response;
    }

    @PutMapping
    public ResponseEntity<String> updateUser(){
        System.out.println("This is UserController --> updateStudent");
        ResponseEntity<String> response = students.updateStudent();
        return  response;
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(String email, String mobile, String password){
        System.out.println("This is UserController --> deleteStudent()");
        ResponseEntity<String> response = students.deleteStudent(email, mobile, password);
        return  response;
    }

    @GetMapping("/{stuId}")
    ResponseEntity<Students> getStudentById(@PathVariable Long stuId){
        System.out.println("This is UserController --> getStuedentById()");
        ResponseEntity<Students> response = students.getStuedentById(stuId);
        return response;
    }
}
