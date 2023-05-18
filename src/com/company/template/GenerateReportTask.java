package com.company.template;

public class GenerateReportTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Performing generate report operation");
    }

    @Override
    protected String taskName() {
        return "Report Generation";
    }
}
