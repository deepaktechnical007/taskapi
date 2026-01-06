package com.practice.student.data.student;

import lombok.Data;

@Data
public class CreateStudentRequest {
    private String name;
    private String email;
    private String mobile;
    private String course;
}
