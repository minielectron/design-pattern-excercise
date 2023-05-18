package com.company.observer;

public class Chart implements Observer{
    @Override
    public void update(int data) {
        System.out.println("Updating chart with value "+ data);
    }
}
