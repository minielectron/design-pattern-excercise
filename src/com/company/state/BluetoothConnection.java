package com.company.state;

public class BluetoothConnection implements Connection {
    @Override
    public void sendData() {
        System.out.println("Sending data over bluetooth");
    }

    @Override
    public void receiveData() {
        System.out.println("Receiving data over bluetooth");
    }
}
