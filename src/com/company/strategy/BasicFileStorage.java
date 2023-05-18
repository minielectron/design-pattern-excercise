package com.company.strategy;

public class BasicFileStorage {

    private final String compressor;
    private final String encryption;

    public BasicFileStorage(String compressor, String encryption) {
        this.compressor = compressor;
        this.encryption = encryption;
    }

    public void store(String fileName){

        //compress file DEFLATE, LZ ..
        if (compressor.equals("LZ")){
            System.out.println("Compressing using LZ");
        } else if (compressor.equals("DEFLATE")) {
            System.out.println("Compressing using DEFLATE");
        }

        //Encryption - DES, AES
        if (encryption.equals("DES")){
            System.out.println(
                    "Applying DES encryption"
            );
        } else if (encryption.equals("AES")) {
            System.out.println("Applying AES encryption");
        }

        System.out.println("Storing the file "+fileName + " to Database");
    }

}
