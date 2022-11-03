package com.company.state;

public class Demo {
    public static void main(String[] args) {
        StateConnectionService connectionService = new StateConnectionService();
        connectionService.setConnectionType(new InternetConnection());
        connectionService.receiveData(); // Receiving data over internet
        connectionService.sendData(); // Sending data over internet
    }
}
