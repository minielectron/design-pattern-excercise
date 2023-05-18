package com.company.observer;

public class Demo {
    public static void main(String[] args) {
        DataSource source = new DataSource();
        Spreadsheet spreadsheet = new Spreadsheet();
        Chart chart = new Chart();
        source.addObserver(spreadsheet);
        source.addObserver(chart);
        source.notifyObservers(30);
    }
}