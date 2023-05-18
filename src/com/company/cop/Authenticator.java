package com.company.cop;

public class Authenticator {
    public boolean authenticate(HttpRequest request){
        return request.getUsername().equals("admin") && request.getPassword().equals("password");
    }
}
