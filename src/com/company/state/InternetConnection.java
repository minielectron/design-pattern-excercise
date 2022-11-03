package com.company.state;

/**
 * This is the example concrete implementation of connection.
 * */
public class InternetConnection implements Connection {
    @Override
    public void sendData() {
        System.out.println("Sending data over internet");
    }

    @Override
    public void receiveData() {
        System.out.println("Receiving data over internet");
    }
}
