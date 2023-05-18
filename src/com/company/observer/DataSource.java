package com.company.observer;

import java.util.HashSet;
import java.util.Set;

public class DataSource {

    /**
     * We are using hashset to avoid the duplicate observer,
     * we don't want to notify same observer twice for same data value.
     * */
    Set<Observer> observers = new HashSet<>();

    void addObserver(Observer observer){
        observers.add(observer);
    }

    void removeObserver(Observer observer){
        observers.remove(observer);
    }

    void notifyObservers(int data){
        observers.forEach(observer -> observer.update(data));
    }
}
