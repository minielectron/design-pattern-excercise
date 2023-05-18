package com.company.template;

public class AnalyticsTask extends Task{

    @Override
    protected void doExecute() {
        System.out.println("Performing analytics");
    }

    @Override
    protected String taskName() {
        return "Analytics";
    }
}
