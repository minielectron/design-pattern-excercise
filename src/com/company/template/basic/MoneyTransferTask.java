package com.company.template.basic;

import com.company.template.Task;

public class MoneyTransferTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Performing money transfer operation");
    }

    @Override
    protected String taskName() {
        return "Money Transfer";
    }
}
