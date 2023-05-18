package com.company.template;

public class MoneyTransferTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Performing money transfer operation");
    }

    @Override
    protected String taskName() {
        return "Money Transfer";
    }
}
