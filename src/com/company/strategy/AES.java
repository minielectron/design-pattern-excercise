package com.company.strategy;

public class AES implements Encryption {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying AES encryption on "+fileName);
    }
}

