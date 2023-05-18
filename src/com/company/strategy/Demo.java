package com.company.strategy;

public class Demo {
    public static void main(String[] args) {
        FileStorage strategyImageStorage = new FileStorage(new DeflateCompressor(), new AES());
        strategyImageStorage.store("rain.png");
        //Compressing rain.png using Deflate algorithm
        //Applying AES encryption on rain.png
        //Storing file rain.png
    }
}

