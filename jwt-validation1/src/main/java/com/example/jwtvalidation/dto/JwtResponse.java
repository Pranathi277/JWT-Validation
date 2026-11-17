
package com.example.jwtvalidation.dto;

import java.util.List;

public class JwtResponse {

    private String message;
    private String username;
    private List<String> roles;

    public JwtResponse(String message, String username,
                       List<String> roles) {
        this.message = message;
        this.username = username;
        this.roles = roles;
    }

    public String getMessage() {
        return message;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
