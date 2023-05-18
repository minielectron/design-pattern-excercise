package com.company.command.fx;

public class Button extends View {

    SaveCommand saveCommand;

    @Override
    public void onClick() {
        System.out.println("Button clicked");
        super.onClick();
    }

    @Override
    public void onLongPress() {
        System.out.println("Button long pressed");
        super.onLongPress();
    }


    public void save(String name) {
        saveCommand.onSave(name);
    }

    public void setCommand(SaveCommand command){
        this.saveCommand = command;
    }
}
