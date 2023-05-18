package com.company.command;

import com.company.command.fx.Button;
import com.company.command.fx.OnViewClickListener;
import com.company.command.fx.SaveCommand;
import com.company.command.fx.TextView;

public class TestActivity {

    public static void main(String[] args) {
        var receiver = new TestActivity();
        Button button = new Button();
        button.setOnClickListener(() -> System.out.println("Sending money to XYZ account"));
        System.out.println("I am going to click the button");
        button.onClick();

        TextView textView = new TextView();
        textView.setOnLongPressListener(() -> System.out.println("Long pressed on text view"));

        textView.onClick();
        textView.onLongPress();

        var saveCommand = receiver.saveCommand();
        button.setCommand(saveCommand);
        button.save("Prakash sharma");
    }

    private SaveCommand saveCommand(){
        return name -> System.out.println("Saving name = "+ name);
    }
}
