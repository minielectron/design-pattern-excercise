package com.company.cop;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle(HttpRequest request) {
        System.out.println("Logging");
        return false;
    }
}
