package com.company.mediator;

public class AlertDialogBox extends DialogBox {
    public Button button = new Button(this);
    public ListBox listBox = new ListBox(this);
    public TextBox textBox = new TextBox(this);

    @Override
    public void changed(UIControl control) {
         if (control == textBox){
             button.setEnabled(!textBox.getContent().isEmpty());
         } else if (control == listBox) {
             textBox.setContent(listBox.getSelection());
         }
    }

    public void printState() {
        System.out.println("Button enabled = " + button.getEnabled());
        System.out.println("TextBox content = " + textBox.getContent());
        System.out.println("ListBox selection = " + listBox.getSelection());
    }
}
