package com.jspider.taskapi.services;

import com.jspider.taskapi.data.users.AppUser;
import com.jspider.taskapi.data.users.CreateUserRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AppUserService {

    ResponseEntity<String> createUser(CreateUserRequest createUserRequest);
    ResponseEntity<String> updateUser();
    ResponseEntity<String> deleteUser(String email,String mobile,String password);
    ResponseEntity<List<AppUser>> getAllUser();
    ResponseEntity<AppUser> getUserById(Long userId);
}
