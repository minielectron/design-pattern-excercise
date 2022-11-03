package com.company.state;

/**
 * Problem statement: Implement a connection service which send/receive the file based on the connection type. Connection
 * could be of type internet/Wifi/Bluetooth etc. Also, the system should be extensible so that in future we can add
 * more options to it.
 * */
public class ConnectionService {

    private ConnectionType type;

    public void sendData(){
        switch (type){
            case BLUETOOTH : {
                System.out.println("Sending data of bluetooth");
            }
            case WIFI : {
                System.out.println("Sending data over wifi");
            }
            case INTERNET : {
                System.out.println("Sending data over internet");
            }
        }
    }

    public void receiveData(){
        switch (type){

            case BLUETOOTH : {
                System.out.println("Receiving data over bluetooth");
            }
            case WIFI : {
                System.out.println("Receiving data over wifi");
            }
            case INTERNET : {
                System.out.println("Receiving data over internet");
            }
        }
    }

    public ConnectionType getType() {
        return type;
    }

    public void setType(ConnectionType type) {
        this.type = type;
    }
}
