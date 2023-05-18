package com.company.strategy;

public class DES implements Encryption {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying DES encryption on "+fileName);
    }
}
