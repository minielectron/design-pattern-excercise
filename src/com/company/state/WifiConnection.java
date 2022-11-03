package com.company.state;

public class WifiConnection implements Connection {
    @Override
    public void sendData() {
        System.out.println("Sending data over wifi");
    }

    @Override
    public void receiveData() {
        System.out.println("Receiving data over wifi");
    }
}
