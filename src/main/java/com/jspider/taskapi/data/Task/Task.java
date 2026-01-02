package com.jspider.taskapi.data.Task;


import lombok.Data;

@Data
public class Task {


    private long taskId;
    private String title;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;


}
