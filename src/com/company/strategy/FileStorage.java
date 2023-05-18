package com.company.strategy;

public class FileStorage {

    private final Compressor compressor;
    private final Encryption encryption;

    public FileStorage(Compressor compressor, Encryption encryption) {
        this.compressor = compressor;
        this.encryption = encryption;
    }

    public void store(String fileName){
        compressor.compress(fileName);
        encryption.apply(fileName);
        System.out.println("Storing file "+fileName);
    }
}
