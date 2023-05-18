package com.company.cop;

public class WebServer {

    private Authenticator authenticator = new Authenticator();
    public void handle(HttpRequest request){
        // We can perform multiple actions here such as
        // Authentication

        if (authenticator.authenticate(request)){
            System.out.println("User is valid, authencation successful");
        }

        // Logging
        // Encryption
        // etc
    }
}
