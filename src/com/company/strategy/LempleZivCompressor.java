package com.company.strategy;

public class LempleZivCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing "+fileName+" using LZ algorithm");
    }
}
