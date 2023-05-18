package com.company.mediator;

public class Demo {
    public static void main(String[] args) {
        var dialog = new AlertDialogBox();
        dialog.listBox.setSelection("Article 1");
        dialog.listBox.setSelection("");
        dialog.printState();
    }
}
