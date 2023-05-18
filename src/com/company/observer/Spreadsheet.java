package com.company.observer;

public class Spreadsheet implements Observer{
    @Override
    public void update(int data) {
        System.out.println("Updating spreadsheet with data = " + data);
    }
}
