package com.company.memento;

import java.util.Stack;

/**
 * This class works as caretaker in memento pattern.*/
public class History {
    private final Stack<Memento> states = new Stack<>();

    void push(Memento state) {
        states.push(state);
    }

    Memento pop() {
        if (states.size() == 1){
            states.pop();
            return null;
        }
        if (states.empty()) return null;
        states.pop();
        return states.peek();
    }
}
