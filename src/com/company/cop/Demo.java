package com.company.cop;

public class Demo {
    public static void main(String[] args) {
        WebServer server = new WebServer();
        HttpRequest request = new HttpRequest("admin", "password");
        server.handle(request);
    }
}
