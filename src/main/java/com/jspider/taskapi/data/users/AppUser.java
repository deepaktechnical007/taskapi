package com.jspider.taskapi.data.users;


import lombok.Data;

@Data
public class AppUser {

    private Long userid;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private boolean isActive;
}
