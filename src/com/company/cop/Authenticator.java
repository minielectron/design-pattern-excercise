package com.company.cop;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    private boolean authenticate(HttpRequest request){
        System.out.println("Authentication");
        return request.getUsername().equals("admin") && request.getPassword().equals("password");
    }

    @Override
    boolean doHandle(HttpRequest request) {
        return !authenticate(request);
    }
}
