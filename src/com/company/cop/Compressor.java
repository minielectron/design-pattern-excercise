package com.company.cop;

public class Compressor extends Handler{
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle(HttpRequest request) {
        System.out.println("Compressing");
        return false;
    }
}
