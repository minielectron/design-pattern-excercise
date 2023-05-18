package com.company.strategy;

public class DeflateCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing "+fileName+" using Deflate algorithm");
    }
}
