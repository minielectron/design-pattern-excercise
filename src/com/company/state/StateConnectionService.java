package com.company.state;

/**
 * This class works as context in the state pattern. [sendData] and [receiveData] works as handle methods.
 * */
public class StateConnectionService {

    private Connection connection;
    void sendData(){
        connection.sendData();
    }

    void receiveData(){
        connection.receiveData();
    }

    public Connection getConnectionType() {
        return connection;
    }

    public void setConnectionType(Connection connection) {
        this.connection = connection;
    }
}
