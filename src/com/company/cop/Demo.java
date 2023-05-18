package com.company.cop;

public class Demo {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator(new Logger(new Compressor(null)));
        WebServer server = new WebServer(authenticator);
        HttpRequest request = new HttpRequest("admin", "password");
        server.handle(request);
    }
}
