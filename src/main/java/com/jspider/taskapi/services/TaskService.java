package com.jspider.taskapi.services;

import com.jspider.taskapi.data.Task.CreateTaskRequest;
import com.jspider.taskapi.data.Task.Task;
import com.jspider.taskapi.data.Task.UpdateTaskRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TaskService {


    ResponseEntity<String> createTask(CreateTaskRequest createTaskRequest);
    ResponseEntity<List<Task>> getAllTask();
    ResponseEntity<Task> getTaskById(Long taskId);
    ResponseEntity<String> updateTask(UpdateTaskRequest updateTaskRequest);
    ResponseEntity<String> deleteTaskById(Long taskId);
}
