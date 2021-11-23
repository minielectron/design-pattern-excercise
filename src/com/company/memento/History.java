package com.company.memento;

import java.util.Stack;

public class History {
    private final Stack<DocumentState> states = new Stack<>();

    void push(DocumentState state) {
        states.push(state);
    }

    DocumentState pop() {
        if (states.size() == 1){
            states.pop();
            return null;
        }
        if (states.empty()) return null;

        states.pop();

        return states.peek();
    }
}
